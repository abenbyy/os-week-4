package models;

public class Dog extends Pet{

	
	public Dog(String name, int price) {
		super.name = name;
		super.price = price;
		super.sold = 0;
	}
	
	public String getName() {
		return super.name;
	}
	
	public int getPrice() {
		return super.price;
	}
	
	@Override
	public void feed() {
		System.out.println(super.name + " is being fed a meat, it barks of excitement");
		
	}
	
	public void trick() {
		System.out.println(super.name + " shakes your hand");
	}

}
