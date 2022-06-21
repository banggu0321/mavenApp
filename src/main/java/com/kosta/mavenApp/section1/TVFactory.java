package com.kosta.mavenApp.section1;

public class TVFactory {
	public static TV makeTV(String company) {
		TV tv = null;
		if(company.equals("samsung")) {
			tv = new SamsungTV("ABC모델", 1000);
		}else if(company.equals("lg")) {
			tv = new LGTV();
		}else {
			
		}
		return tv;
	}
}
