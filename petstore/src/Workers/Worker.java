package Workers;

public class Worker {
String name;
int id;
Duties d;
public Worker(String name, int id)
{
	this.name = name;
	this.id = id;
}
public void walk()
{
	System.out.println("walk");
}
public void performDuty()
{
	d.duty();
}

}
