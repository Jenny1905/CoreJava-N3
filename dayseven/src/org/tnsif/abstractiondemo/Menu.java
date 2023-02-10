package org.tnsif.abstractiondemo;

//program to demonstrate on abstract class and abstract method
//abstract class
//class cannot be final abstract
public abstract class Menu {
	
	//abstract method
	abstract void recipe();
	abstract void foodType();
	//concrete method
	void menuType()
	{
		System.out.println("Veg and Nonveg");
	}

}
