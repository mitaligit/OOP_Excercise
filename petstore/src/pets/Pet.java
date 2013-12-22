package pets;
import petlocations.PetLivingPlace;


public abstract class Pet {
@Override
	public String toString() {
		return "Pet [name=" + name + ", id=" + id + ", b=" + b + ", s=" + s
				+ ", pl=" + pl + "]";
	}
String name;
int id;
Breed b;
Sound s;
PetLivingPlace pl;
public Pet(String name, int id)
{
	this.name = name;
	this.id = id;
}
public void performSound()
{
	s.speak();
}
public void eat()
{
	System.out.println("eat");
}
public void setBreed(Breed b)
{
	this.b = b; 
}
public abstract void display();
}
