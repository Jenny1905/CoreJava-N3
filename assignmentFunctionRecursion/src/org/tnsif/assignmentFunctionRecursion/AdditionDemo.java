package org.tnsif.assignmentFunctionRecursion;
//to demonstrate an example on function
import java.util.Scanner;

public class AdditionDemo {
	
	 //Function definition
	 /*static int addition(int x,int y) {
		int sum=x+y;
		return sum;
	}*/
	//function definition
	 static void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("The sum is: "+sum);
	}

	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		//function call
		addition(x,y);
		s.close();
		//System.out.println(addition(x,y));
		
		
		
		

	}

}
