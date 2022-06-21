package com.kosta.mavenApp.section1;

public class LGTV implements TV{
	public void turnON(){
		System.out.println(this.getClass().getSimpleName() + "전원을 켠다.");
	}
	public void turnOff(){
		System.out.println(this.getClass().getSimpleName() + "전원을 끈다.");
	}
	@Override
	public void powerON() {
		System.out.println(this.getClass().getSimpleName() + "전원을 켠다.");		
	}
	@Override
	public void powerOff() {
		System.out.println(this.getClass().getSimpleName() + "전원을 끈다.");
		
	}
}
