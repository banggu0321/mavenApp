package com.kosta.mavenApp.section3_d02;

import org.kosta.mavenApp.section4_d02.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUsingTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di4_d02.xml");
		
		Car car = ctx.getBean("cc",Car.class);			//@Component
		Book book = ctx.getBean("book",Book.class);		//@Component
		License li = ctx.getBean("li1",License.class); 	//@Component("li1")
		Person p = ctx.getBean("person1",Person.class);	//@Component("person1")
		System.out.println(car);
		System.out.println(book);
		System.out.println(li);
		System.out.println(p);
		
	}
}
