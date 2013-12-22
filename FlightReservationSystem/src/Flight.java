import java.util.*;
public class Flight {
@Override
	public String toString() {
	String str = "";
		str = str+ "Flight [origin=" + origin + ", destination=" + destination
				+ ", flightNumber=" + flightNumber + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", date=" + date + ", plane="
				+ plane + ", seats=";
		for(Seat s: seats)
		{
			str = str + s + ",";
		}
		 str = str+"]";
		 return str;
	}
String origin;
String destination;
int flightNumber;
String startTime;
String endTime;
String date;
Plane plane;
List<Seat> seats = new ArrayList<Seat>();
//List<Seat> seats;
Flight(String origin, String destination, int flightNumber, String startTime, String endTime, String date, Plane plane)
{
	this.origin = origin;
	this.destination = destination;
	this.flightNumber = flightNumber;
	this.startTime = startTime;
	this.endTime = endTime;
	this.date = date;
	this.seats = plane.getSeatsAvailability();
	this.plane = plane;
}
public boolean isEqualTo(Flight f1)
{
	if(this.origin.equalsIgnoreCase(f1.origin))
	{
		if(this.destination.equalsIgnoreCase(f1.destination))
		{
			if(this.flightNumber == f1.flightNumber)
			{
				if(this.startTime.equalsIgnoreCase(f1.startTime))
				{
					if(this.endTime.equalsIgnoreCase(f1.endTime))
					{
						if(this.date.equalsIgnoreCase(f1.date))
						{
							return true;
						}
					}
				}
			}
		}
	}
		return false;
}

public Map<SeatType, Integer> getnumofseats()
{
	Map<SeatType, Integer> emptySeats = new HashMap<SeatType, Integer>();
	//todo tomorrow
	for(Seat s1: seats)
	{
		if(s1.isOccupied() == false)
		{
			if(!emptySeats.containsKey(s1.getS()))
			{
				emptySeats.put(s1.getS(), 1);
			}
			else
			{
				int n = emptySeats.get(s1.getS());
				emptySeats.put(s1.getS(), n+1);
			}
		}
	}
	return emptySeats;
}
public int[] bookSeats(int howManySeats, SeatType st, PaymentMethod p) throws Exception
{
	double amount = 0;

	int[] resultBook = new int[howManySeats];
	int k = 0;
	for(int i = 0; i<seats.size(); i++)
	{
		if(howManySeats>0)
		{
			Seat realSeat = seats.get(i);
			if(realSeat.isOccupied() == false && realSeat.getS() == st)
			{
				realSeat.setOccupied(true);
				resultBook[k] = realSeat.getSeatNumber();
				k++;
				howManySeats--;
			}
		}
		else
		{
			break;
		}
	}
	if(howManySeats>0)
	{
		for(int i = 0; i<resultBook.length; i++)
		{
			int n = resultBook[i];
			for(int j = 0; j<seats.size(); j++)
			{
				Seat newSeat = seats.get(j);
				if (n == newSeat.getSeatNumber())
				{
					newSeat.setOccupied(false);
				}
				break; 
			}
			
		}
		throw new Exception("no seats");
	}
	for(int n:resultBook)
	{
		for(int j = 0; j<seats.size(); j++)
		{
			Seat newSeat = seats.get(j);
			if (n == newSeat.getSeatNumber())
			{
				System.out.println(newSeat.getRate());
				amount = amount + newSeat.getRate();
				break;
			}
		}
	}
	
	boolean b = p.charge(amount);
	if(b == true)
	{
	return resultBook;
	}
	else
	{
		return  null;
	}
}
}
