package org.tnsif.polymorphismdemo;
import java.util.Scanner;
//program to demonstrate on constructor overloading
//driver class
public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed and color of"
				+ "a hondacity");
		int speed=s.nextInt();
		s.nextLine();
		String color=s.nextLine();
		HondaCity c=new HondaCity();
		HondaCity c1=new HondaCity(speed,color);
		
		

	}

}
