package com.test.menu;

public class Menu {

	
	public Menu(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	private String name;
	
	private Double price;

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
}
