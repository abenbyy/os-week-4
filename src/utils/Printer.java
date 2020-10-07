package utils;

import database.Database;
import models.Dog;
import models.Fish;
import models.Pet;

public class Printer {

	public static void cls() {
		for(int i=0;i<50;i++) {
			System.out.println();
		}
	}
	
	public static void menu() {
		System.out.println("1. Buy Pet");
		System.out.println("2. View Pet");
		System.out.println("3. Exit");
		System.out.print(">> ");
	}
	
	public static void action(Pet pet) {
		System.out.println("1. Give Snack");
		if(pet instanceof Dog) {
			System.out.println("2. Do Trick");
		}else if(pet instanceof Fish) {
			System.out.println("2. Swim");
		}
		System.out.print(">> ");
	}
	
	public static void buyMenu() {
		System.out.println("+===============================================================+");
		System.out.println("| ID | Name          | Type       | Price          | Sold       |");
		System.out.println("+===============================================================+");
		
		int idx = 0;
		
		for (Pet p : Database.pets) {
			idx++;
			System.out.println(String.format("| %2d | %13s | %4s       | %14d | %10d |", idx, p.name, p instanceof Dog? "Dog":"Fish", p.price, p.sold));
			
		}
		
		System.out.println("+===============================================================+");
		System.out.print(">> ");
	}
	
	public static void viewMenu() {
		System.out.println("+=================================+");
		System.out.println("| ID | Name          | Type       |");
		System.out.println("+=================================+");
		
		int idx = 0;
		
		for (Pet p : Database.pets) {
			idx++;
			System.out.println(String.format("| %2d | %13s | %4s       |", idx, p.name, p instanceof Dog? "Dog":"Fish"));
		}
		
		System.out.println("+=================================+");
		System.out.print(">> ");
	}
	
	
}
