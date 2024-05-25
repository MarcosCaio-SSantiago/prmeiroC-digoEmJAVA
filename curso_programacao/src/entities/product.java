package entities;

public class product {

	private String nome;
	private double price;


    public product() {
}


	public product(String nome, double price) {
		this.nome = nome;
		this.price = price;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
    
    
}