package org.tnsif.exceptionhandlingdemo;
import java.util.Scanner;
//program to demonstrate on multiple catch block
public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {11,22,33};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		
		try {
			int res=x/y;
			System.out.println(res);
			System.out.println(arr[3]);
		}
		//we can use multiple catch block
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: ");
		}
		

	}

}
