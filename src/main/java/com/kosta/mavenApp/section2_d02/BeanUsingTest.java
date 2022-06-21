package com.kosta.mavenApp.section2_d02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUsingTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di2_d02.xml");
//		Car c1 = (Car)ctx.getBean("car1");
//		Car c2 = ctx.getBean("car2",Car.class);
//		Car c3 = ctx.getBean("car3",Car.class);
//		Car c4 = ctx.getBean("car4",Car.class);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
		
		Person p1 = ctx.getBean("person1",Person.class);
		Person p2 = ctx.getBean("person2",Person.class);
		Person p3 = ctx.getBean("person3",Person.class);	
		Person p4 = ctx.getBean("person4",Person.class);	
		Person p5 = ctx.getBean("person5",Person.class);	
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}
}
