package Workers;

public class PetLooker extends Worker{
	public PetLooker(String name, int id)
	{
		super(name, id);
		d = new PetLookerDuty();
	}
}
