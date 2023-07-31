package entities;

public class Product implements Comparable<Product> {

	String name;
	Double price;
	
	public Product() {
		
	}
	
	public Product (String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return this.name + ", " + String.format("%.2f", this.price);
	}
	
	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return this.price.compareTo(p.getPrice());
	}
	
	
}
