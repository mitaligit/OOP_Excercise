package pets;


public enum CatBreed implements Breed{
IndianCat, AsianCat, AmericanCat ;

public String toString() {
	return ( " cat " + this.name());
	}
}
