package pets;


public enum DogBreed implements Breed{
IndianDog, AsianDog, AmericanDog ;
public String toString() {
	return ( " dog " + this.name());
	}
}
