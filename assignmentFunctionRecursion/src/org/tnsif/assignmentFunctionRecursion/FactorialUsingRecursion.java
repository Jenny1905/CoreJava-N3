package org.tnsif.assignmentFunctionRecursion;
//example on factorial of a number using recursion

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		//fun call
		System.out.println("Factorial of a given number is: "
		+factorial(num));
		s.close();

	}

}
