
public class Seat {
	@Override
	public String toString() {
		return "Seat [seatNumber=" + seatNumber + ", occupied=" + occupied
				+ ", s=" + s + getRate() + "]";
	}
	private int seatNumber;
	public int getSeatNumber() {
		return seatNumber;
	}
	private boolean occupied;
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public boolean isOccupied() {
		return occupied;
	}
	private SeatType s;
	public SeatType getS() {
		return s;
	}
	public void setS(SeatType s) {
		this.s = s;
	}
	public PriceChart getP() {
		return p;
	}
	public void setP(PriceChart p) {
		this.p = p;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	private PriceChart p;
	public Seat(int seatNumber, SeatType s, PriceChart p)
	{
		this.seatNumber = seatNumber;
		occupied = false;
		this.s = s;
		this.p = p;
		//p.rate.put(s, r);
	}
	
	public Seat(Seat s1 )
	{
		this.seatNumber = s1.seatNumber;
		occupied = false;
		this.s = s1.s;
		this.p = s1.p;
		//p.rate.put(s, r);
	}
	
	public double getRate()
	{
		double rate = p.getRate().get(this.s);
		return rate;
	}
}
