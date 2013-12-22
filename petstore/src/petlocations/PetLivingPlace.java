package petlocations;

public class PetLivingPlace {
int number;
Location l;
boolean isDirty;

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public Location getL() {
	return l;
}
public void setL(Location l) {
	this.l = l;
}
public boolean isDirty() {
	return isDirty;
}
public void setDirty(boolean isDirty) {
	this.isDirty = isDirty;
}

public PetLivingPlace(int number, boolean isDirty)
{
	this.number = number;
	this.isDirty = isDirty;
}
}
