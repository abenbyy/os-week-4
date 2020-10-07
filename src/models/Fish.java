package models;

public class Fish extends Pet{

	public Fish(String name, int price) {
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
		System.out.println(super.name + " is being fed a pellet, it's relatively quiet");
		
	}
	
	public void swim() {
		System.out.println(super.name + " goes 'blub blub blub' and swims around");
	}
	
}
