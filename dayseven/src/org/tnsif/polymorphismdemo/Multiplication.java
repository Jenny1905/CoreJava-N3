package org.tnsif.polymorphismdemo;
//program to demonstrate on method overloading

public class Multiplication {
	
	//method overloading in terms of by changing the datatype
	int mul(int x,int y)
	{
		return x*y;
	}
	
	int mul(float x,int y)
	{
		return (int) (x*y);
		
	}

}
