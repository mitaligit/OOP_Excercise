package pets;
import petlocations.Cage;
import petlocations.CageLocation;
import petlocations.Location;


public class Dog extends Pet{

public Dog(String name, int id, Breed b)
{
	super(name, id);
	s = new DogSound();
	this.b = b;
	int number = 1;
	boolean isDirty = false;
	Location l = CageLocation.NorthEast;
	pl = new Cage(number, isDirty, l);
}
public void display()
{
	System.out.println("cat");
}
}
