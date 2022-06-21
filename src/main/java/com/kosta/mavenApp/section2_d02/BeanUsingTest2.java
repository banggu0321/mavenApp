package com.kosta.mavenApp.section2_d02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUsingTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di3_d02.xml");
		
		Person p1 = ctx.getBean("person",Person.class);
		Person p2 = ctx.getBean("person2",Person.class);
		Person p3 = ctx.getBean("person2",Person.class);
		System.out.println(p1); //autowire="byName"
		System.out.println(p2); //autowire="byType"
		System.out.println(p2==p3); //같은 빈을 얻은 또 new하는지? default는 안함(singleton)
		
		//scope="prototype" 인 경우는 getBean()할때마다 새로생성
	}
}
