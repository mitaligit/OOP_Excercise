import java.util.*;
public class Reservation {
	public static void main(String[] args)
	{
		Reservation r = new Reservation(5,6);
		PaymentMethod p = new CreditCard(12344, 334);
		PaymentMethod pm = new BankAccount(123456);
		List<SearchResult> res = r.search("Seattle0", "SanFrancisco0", "08/13/2013");
		for(SearchResult sr: res)
		{
		System.out.println(sr);
		}
		int[] bookedSeats = r.book(0, "08/13/2013", 2, SeatType.Business, p);
		for(int n: bookedSeats)
		{
		System.out.println("booked seat numbers are: " + n);
		}
		List<SearchResult> res1 = r.search("Seattle1", "SanFrancisco1", "08/13/2013");
		for(SearchResult sr1: res1)
		{
		System.out.println(sr1);
		}
		int[] bookedSeats1 = r.book(1, "08/13/2013", 2, SeatType.Economy, p);
		for(int n1: bookedSeats1)
		{
		System.out.println("booked seat numbers are: " + n1);
		}
		//SearchResult res1 = r.search("Seattle0", "SanFrancisco0", "08/13/2013");
		//System.out.println(res1);
		
		
	}
Flight f;
Set<Flight> setOfFlight = new HashSet<Flight>();
PriceChart p;
Toilet toilet;
public Reservation(int n, int numofseats)
{
	Map<SeatType, Double> mp = new HashMap<SeatType, Double>();
	SeatType st[] = SeatType.values();
	mp.put(st[0], 50.00);
	mp.put(st[1], 20.00);
	mp.put(st[2], 30.00);
	p = new PriceChart(mp);
	List<Seat> seats = new ArrayList<Seat>();
	int k = 0;
	//for(int i =0; i<n; i++)
	//{
		//seats = new ArrayList<Seat>();
		for(int j = 0; j < numofseats; j++)
		{

			SeatType st1[] = SeatType.values();
			//System.out.println(st1[k] +" " +  k);
			seats.add(new Seat(j, st1[k], p));
			if(k<2)
			{
				k++;
			}
			else
			{
				k = 0;
			}
			
		}
		List<Toilet> toilets = new ArrayList<Toilet>();
		ToiletLocation tl[] = ToiletLocation.values();
		int count = 0;
		for(ToiletLocation t : tl)
		{
			toilets.add(new Toilet(count, t));
			count++;
		}
		Plane beoingPlane = new Boeing(seats, toilets, "firtstBeoingPlane", 34000, 5);
		Plane airBusPlane = new AirBus(seats, toilets , "FirstAirBusPlane", 40000, 3 );
		for(int i =0; i<n; i++)
		{
			if(i%2 == 0)
			{
			Flight f = new Flight("Seattle" + i, "SanFrancisco" + i, i, "09:00am", "12:00pm", "08/13/2013", beoingPlane);
			setOfFlight.add(f);
			System.out.println(f);
			}
			else
			{
				Flight f = new Flight("Seattle" + (i-1), "SanFrancisco" + (i-1), i, "09:00am", "12:00pm", "08/13/2013", airBusPlane);
				setOfFlight.add(f);
				System.out.println(f);
			}
		}
	//}
	
}
public List<SearchResult> search(String origin, String destination, String date)
{
	List<SearchResult> sr = new ArrayList<SearchResult>();
	Set<Flight> result = new HashSet<Flight>();
	Flight f = null;
	for(Flight f1: setOfFlight)
	{
		
		if(f1.origin.equalsIgnoreCase(origin) && f1.destination.equalsIgnoreCase(destination) && f1.date == date)
		{
			f = f1;
			result.add(f1);
			
		}
	}
	for(Flight flight: result)
	{
	Map<SeatType, Double> rate = p.getRate();
	Map<SeatType, Integer> mp = flight.getnumofseats();
	
	sr.add(new SearchResult(flight.flightNumber, flight.origin, flight.destination, flight.startTime, flight.endTime, mp, rate));
	}
	return sr;
}
public int[] book(int flightNumber, String date, int howManySeats, SeatType s, PaymentMethod p)
{
	int[] sn = new int[howManySeats];
	Map<SeatType, Integer> m = new HashMap<SeatType, Integer>();
	Flight f = null;
	for(Flight f2:setOfFlight)
	{
		if(flightNumber ==f2.flightNumber && date == f2.date)
		{
			f = f2;
			break;
		}
	}
	
	try {
		sn = f.bookSeats(howManySeats, s, p);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sn;
}

}
