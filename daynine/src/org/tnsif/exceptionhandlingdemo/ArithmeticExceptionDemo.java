package org.tnsif.exceptionhandlingdemo;
import java.util.Scanner;

//program to demonstrate on ArithmaticException
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains the excption code
		try {
			int res=x/y;
			System.out.println(res);

		}
		//catch block handles the exception thrown by try block 
		catch(Exception e)
		{
			System.out.println("Exception handled using catch: "+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}

}
