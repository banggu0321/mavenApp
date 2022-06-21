package com.kosta.mavenApp.section1_d01;

public class User1 {

	public static void main(String[] args) {
		TV tv = TVFactory.makeTV("samsung");
		tv.powerON();
		tv.powerOff();
	}

}
