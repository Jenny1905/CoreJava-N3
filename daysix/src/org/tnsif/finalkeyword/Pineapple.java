package org.tnsif.finalkeyword;

public class Pineapple extends Cake{
	
	private int price;
	/* if any method is declared as final in parent class
	 * and we are going to use that method inside the child class
	 * then we can't override but we can overload it. 
	 */
	/*void display()
	{
		System.out.println();
	}*/
	final void display(int price)
	{
		System.out.println("The price is: "+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
}
