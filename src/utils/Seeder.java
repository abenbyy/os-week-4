package utils;

import database.Database;
import models.Dog;
import models.Fish;

public class Seeder {
	
	public static void run() {
		Database.pets.add(new Dog("Dobberman", 200));
		Database.pets.add(new Fish("Tuna", 15));
		Database.pets.add(new Dog("Golden", 175));
		Database.pets.add(new Fish("Salmon", 35));
		Database.pets.add(new Dog("Shiba", 185));
		Database.pets.add(new Fish("Arowana", 15));
		Database.pets.add(new Dog("Husky", 250));
	}
}
