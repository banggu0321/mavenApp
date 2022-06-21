package com.kosta.mavenApp.section4.aop2_d02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop2_d02.xml");
		Calculator cal = ctx.getBean("proxyCal",Calculator.class);
		cal.add(10);
		
	}
}
