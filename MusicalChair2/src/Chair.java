
public class Chair {
	boolean occupied;

	public Chair(boolean occupied)
	{
		this.occupied = occupied;
	}
	public boolean fillChair()
	{
		if(occupied == true)
		{
			return false;
		}
		else
		{
		occupied = true;
		return occupied;
		}
	}
	public boolean emptyChair()
	{
		occupied = false;
		return occupied;
	}
}
