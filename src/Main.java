import java.util.Scanner;

import database.Database;
import models.Dog;
import models.Fish;
import utils.Printer;
import utils.Seeder;

public class Main {

	Scanner scan;
	
	public void buy() {
		int idx = -1;
		
		do {
			Printer.cls();
			Printer.buyMenu();
			
			idx = scan.nextInt();
			scan.nextLine();
			
		}while(idx < 0 || idx > Database.pets.size());
		
		System.out.println("Thank You for Purchasing " + Database.pets.get(idx-1).name);
		Database.pets.get(idx-1).sold++;
		scan.nextLine();
		
	}
	
	public void view() {
		int idx = -1;
		
		do {
			Printer.cls();
			Printer.viewMenu();
			
			idx = scan.nextInt();
			scan.nextLine();
			
		}while(idx < 0 || idx > Database.pets.size());
		
		int inp;
		
		do {
			Printer.cls();
			Printer.action(Database.pets.get(idx-1));
			
			inp = scan.nextInt();
			scan.nextLine();
			
			if(inp == 1) {
				Database.pets.get(idx-1).feed();
				scan.nextLine();
			}else if(Database.pets.get(idx-1) instanceof Dog) {
				Dog d = (Dog) Database.pets.get(idx-1);
				d.trick();
				scan.nextLine();
			}else if(Database.pets.get(idx-1) instanceof Fish) {
				Fish f = (Fish) Database.pets.get(idx-1);
				f.swim();
				scan.nextLine();
			}
		}while(inp < 0 || inp > 2);
		
	}
	
	
	public Main() {
		scan = new Scanner(System.in);
		Seeder.run();
		
		int inp = -1;
		do {
			Printer.cls();
			Printer.menu();
			
			inp = scan.nextInt();
			scan.nextLine();
			
			switch(inp) {
				case 1:
					buy();
					break;
				case 2:
					view();
					break;
				default:
					break;
			}
			
			
		}while(inp != 3);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
}
