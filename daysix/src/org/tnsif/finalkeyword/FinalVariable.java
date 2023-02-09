package org.tnsif.finalkeyword;
//program to demonstrate on final keyword with variable
public class FinalVariable {
	
	//final variable
	final static int x=15;
	public static void print()
	{
		/*we can't change the value of x here 
		 as x is declared as final*/
		//x=17;
		System.out.println("The value of x is: "+x);
	}
	public static void main(String args[])
	{
		
		FinalVariable.print();
	}

}
