import java.util.ArrayList;
import java.util.List;


public class Boeing extends Plane{
public Boeing(List<Seat> seats, List<Toilet> toilets, String name, int height, int distance)
{
	super(seats, toilets, name, height, distance); 
}

public void fly()
{
	startEngine();
	runOnAirplaneRoad();
	takeOff();
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
	while(currentDistance<super.getDistance())
	{
		currentDistance = currentDistance+100;
	}
}
public void takeOff()
{
	System.out.println("plane took off");
}
public void reachFlyingHeight()
{
	int currentHeight = 0;
	while(currentHeight < super.getHeight())
	{
		currentHeight = currentHeight+ 50;
	}
}
public void cruiseOnFlyingHeight()
{
	System.out.println("keep on flying");
}
}
