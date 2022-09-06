package tw.com.eeit.serial.test;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1;
	
	private String name;
	private int price;

	public Product() {
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
