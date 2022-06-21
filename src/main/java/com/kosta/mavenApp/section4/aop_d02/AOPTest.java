package com.kosta.mavenApp.section4.aop_d02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop1_d02.xml");
		Calculator cal = ctx.getBean("proxyCal",Calculator.class);
		cal.add();
		cal.add(10,20);
		cal.add(100);
		System.out.println("---------");
		cal.divide(10, 5);
	}
}
