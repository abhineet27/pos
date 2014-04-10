package com.test.menu;

public enum MenuItem 
{
	Burger_1(50.00),Burger_2(55.00),Burger_3(45.00),Fries(30.00), ColddDrinks_1(10.00), ColddDrinks_2(10.00), Toys (35.00), IceCreams(25.00);
	
	public Double price;
	MenuItem(Double price){
		this.price = price;
	}
	
}
