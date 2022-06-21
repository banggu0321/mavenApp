package com.kosta.mavenApp.section1_d01;

public class SamsungTV implements TV{
	
	String model;
	int price;
	
	
	public SamsungTV(String model, int price) {
		super();
		this.model = model;
		this.price = price;
		System.out.println("SamsungTV생성됨");
	}

	public void powerON(){
		System.out.println(this.getClass().getSimpleName() + "전원을 켠다.");
	}
	public void powerOff(){
		System.out.println(this.getClass().getSimpleName() + "전원을 끈다.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SamsungTV [model=").append(model).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
}
