package entities;

public class Orderltem {
	
	public int integer;
	public double price; 
  
    public Orderltem() {
    	
    	
    }

	public Orderltem(int integer, double price) {
		this.integer = integer;
		this.price = price;
	}

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
	double som = integer + price;

	


}