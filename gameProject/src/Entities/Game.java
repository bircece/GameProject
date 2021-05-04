package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private int Price;
	public Game(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
