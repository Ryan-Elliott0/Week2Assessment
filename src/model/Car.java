package model;

public class Car {
	
	private String name;
	private int age;
	private boolean discount;
	private double price;
	
	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
