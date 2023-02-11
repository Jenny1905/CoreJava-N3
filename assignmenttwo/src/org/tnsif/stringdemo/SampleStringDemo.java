package org.tnsif.stringdemo;
import java.util.Scanner;
//program to demonstrate an example on string creation
public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//using string literal
		System.out.println("Enter the first string: ");
		String str1=s.nextLine();
		System.out.println("First String is: "+str1);
		//using new keyword
		System.out.println("Enter the second string: ");
		String str2=new String(s.nextLine());
		System.out.println("Second String is: "+str2);
		if(str1.equals(str2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		char c[]= {'H','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3);
		

	}

}
