package Workers;

public class Janitor extends Worker{
	
	public Janitor(String name, int id)
	{
		super(name, id);
		d = new JanitorDuty();
	}
	
}
