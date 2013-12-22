package petlocations;

public class Pond extends PetLivingPlace{
	public Pond(int number, boolean isDirty, Location pl)
	{
		super(number, isDirty);
		l = pl;
		
	}
}
