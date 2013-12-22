import java.util.*;
public class SearchResult {
@Override
	public String toString() {
	String str = "";
		str = str + "SearchResult [flightnum=" + flightnum +", origin: " + origin + ", destination: " + destination
				+ ", startTime: " + startTime + ", endTime: " + endTime +"\n" + "seatavailability";
				for(SeatType s: seatavailability.keySet())
				{
					int n = seatavailability.get(s);
					str =  str+ "\n" + " " + "Seat Type:" + s;
					str = str+ ", " + "number of seats available: " +n;
				}
				str = str+ "\n" + " " + "price=";
				for(SeatType s: rate.keySet())
				{
					Double k = rate.get(s);
					str = str+ "\n" +" " + "Seat Type:"+ s+ " ";
					str = str+ ", " + "price:" + k+ " ";
				}
				return str;
				}
int flightnum;
String origin;
String destination;
String startTime;
String endTime;
Map<SeatType, Integer> seatavailability= new HashMap<SeatType, Integer>();
Map<SeatType, Double> rate = new HashMap<SeatType, Double>();
public SearchResult(int flightnum, String origin, String destination, String startTime, String endTime, Map<SeatType, Integer> seatavailability, Map<SeatType, Double> rate)
{
	this.flightnum = flightnum;
	this.origin = origin;
	this.destination = destination;
	this.startTime = startTime;
	this.endTime = endTime;
	this.seatavailability = seatavailability;
	this.rate = rate;
}
}
