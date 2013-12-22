package pets;
import petlocations.Cage;
import petlocations.Location;
import petlocations.PondLocation;


public class Cat extends Pet{
public Cat(String name, int id, Breed b)
{
	super(name, id);
	s = new CatSound();
	this.b = b;
	int number = 1;
	boolean isDirty = false;
	Location l = PondLocation.NorthLeft;
	pl = new Cage(number, isDirty, l);
}
public void display()
{
	System.out.println("cat");
}
}
