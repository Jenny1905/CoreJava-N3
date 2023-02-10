package org.tnsif.polymorphismdemo;
//program to demonstrate on constructor overloading
public class HondaCity {
	
	private int speed;
	private String color;
	//getters and setters
	/*
	 * public int getSpeed() { return speed; } public void setSpeed(int speed) {
	 * this.speed = speed; } public String getColor() { return color; } public void
	 * setColor(String color) { this.color = color; }
	 */
	//constructor overloading
	
	//constructor with no arguments
	public HondaCity() {
		System.out.println("I like to drive a HondaCity");
	}
	//constructor with arguments
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("speed is: "+speed+","
				+"Color is: "+color);
	}
	
	
	

}
