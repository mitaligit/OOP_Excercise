import java.util.*;
public abstract class Plane {
	@Override
	public String toString() {
		String str = "";
		str = str + "Plane [seats=";
		for(Seat s: seats)
		{
			str = str+ s;
		}
		str = str + ", toilets=";
		for(Toilet t: toilets)
		{
			str = str+t;
		}
		str = str+ ", name=" + name + ", flyingHeight=" + flyingHeight + ", distance=" + distance + "]";
		return str;
	}
	private List<Seat> seats = new ArrayList<Seat>();
	private List<Toilet> toilets = new ArrayList<Toilet>();
	private String name;
	private int flyingHeight;
	private int distance;
	
	public Plane(List<Seat> seats, List<Toilet> toilets, String name, int height, int distance)
	{
		this.seats = seats;
		this.toilets = toilets;
		this.name = name;
		this.flyingHeight = height;
		this.distance = distance;
	}

	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public List<Toilet> getToilets() {
		return toilets;
	}
	public void setToilets(List<Toilet> toilets) {
		this.toilets = toilets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return flyingHeight;
	}
	public void setHeight(int height) {
		this.flyingHeight = height;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

	/*public final void templatePatternExamplefly() {
		performPreFlightChecks();
		getClearanceFromAirTrafficController();
		takeOff();
		cruise();
	}
	
	public abstract void performPreFlightChecks();
	public abstract void getClearanceFromAirTrafficController();
	public abstract void takeOff();
	public abstract void cruise();*/
	
	//public abstract void move();
	public List<Seat> getSeatsAvailability()
	{
		List<Seat> seatsAvailability = new ArrayList<Seat>();
		for(Seat s : seats){
			seatsAvailability.add(new Seat(s));
		}
		return seatsAvailability;
	}

}
