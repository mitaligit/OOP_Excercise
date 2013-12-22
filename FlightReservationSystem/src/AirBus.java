import java.util.ArrayList;
import java.util.List;


public class AirBus extends Plane{
public AirBus(List<Seat> seats, List<Toilet> toilets, String name, int height, int distance)
{
	super(seats, toilets, name, height, distance);
}
	
	public void fly()
	{
		startEngine();
		runOnAirplaneRoad();
		reachFlyingHeight();
		cruiseOnFlyingHeight();
	}

	public void startEngine()
	{
		System.out.println("engine started");
	}
	public void runOnAirplaneRoad()
	{
		int currentDistance = 0;
		while(currentDistance<super.getDistance()+100)
		{
			currentDistance = currentDistance+100;
		}
	}
	public void reachFlyingHeight()
	{
		int currentHeight = 0;
		while(currentHeight <super.getHeight()+100)
		{
			currentHeight = currentHeight+ 50;
		}
	}
	public void cruiseOnFlyingHeight()
	{
		System.out.println("keep on flying");
	}

	/*@Override
	public void performPreFlightChecks() {
		return;
	}

	@Override
	public void getClearanceFromAirTrafficController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cruise() {
		// TODO Auto-generated method stub
		
	}*/
}
