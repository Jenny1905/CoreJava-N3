package org.tnsif.finalkeyword;
//program to demonstrate on final class
//parent class
public final class Currency {
	
	//private data members
	private String type;
	void print()
	{
		System.out.println("Currency Type is: "+type);
	}
	//getters and setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
