package com.kosta.mavenApp.section2_d02;

//JavaBeans 조건(필수) : 변수는 접근지정자가 private, default생성자, getter/setter
//VO(Value Object)
//DAO(Data Transfer Object

public class Car {
	private String model;
	private int price;
	private String color;
	
	public Car() {
		System.out.println("default생성자를 이용해서 Car를 만듬");
	}
	
	public Car(String model, int price, String color) {
		super();
		this.model = model;
		this.price = price;
		this.color = color;
		System.out.println("argument 3개있는 생성자로 생성");
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		System.out.println("setModel : " + model);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("setPrice : " + price);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("setColor : " + color);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [model=").append(model).append(", price=").append(price).append(", color=").append(color)
				.append("]");
		return builder.toString();
	}
}
