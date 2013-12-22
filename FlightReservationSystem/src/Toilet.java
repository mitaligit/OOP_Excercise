
public class Toilet {
@Override
	public String toString() {
		return "Toilet [number=" + number + ", l=" + l + "]";
	}
int number;
ToiletLocation l;
public Toilet(int number, ToiletLocation l)
{
	this.number = number;
	this.l = l;
}
public int getNumber()
{
	return number;
}
public void setNumber(int number)
{
	this.number = number;
}
public ToiletLocation getLocation()
{
	return l;
}
public void setLocation(ToiletLocation l)
{
	this.l = l;
}
}
