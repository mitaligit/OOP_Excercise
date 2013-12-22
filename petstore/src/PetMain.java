import java.util.*;

import Workers.Cashier;
import Workers.Janitor;
import Workers.PetLooker;
import Workers.Worker;

import pets.Breed;
import pets.Cat;
import pets.CatBreed;
import pets.Dog;
import pets.DogBreed;
import pets.Pet;
public class PetMain {
	public static void main(String[] args)
	{
		PetMain p = new PetMain(5);

	}
	Pet p;
	Set<Pet> pets = new HashSet<Pet>();
	Set<Worker> workers = new HashSet<Worker>();
	Breed b[] = CatBreed.values();
	Breed b2[] = DogBreed.values();
	public PetMain(int n)
	{
		int j = 0;
		int k = 0;
		for(int i = 0; i<n; i++)
		{
			String name = "mitali" + "i";                                                             
			int id = i;
			if(j>=3)
			{
				j = 0;
			}
			if(k>=3)
			{
				k = 0;
			}
			if(i%2 == 0)
			{
				Breed b1 = b[j];
				j++;
				Pet p = new Cat(name, id, b1);
				p.performSound();
				pets.add(p);
				System.out.println(p);
			}
			else
			{
				Breed b3 = b2[k];
				k++;
				Pet p = new Dog(name, id, b3);
				p.performSound();
				pets.add(p);
				System.out.println(p);
			}

		}
		
		Worker w = new Janitor("gita", 1);
		workers.add(w);
		w.performDuty();
		Worker w1 = new Cashier("uma" ,2);
		workers.add(w1);
		w1.performDuty();
		Worker w3 = new PetLooker("shanti", 3);
		w3.performDuty();
		
		
	}

}
