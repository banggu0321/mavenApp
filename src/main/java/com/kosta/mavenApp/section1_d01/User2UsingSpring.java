package com.kosta.mavenApp.section1_d01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class User2UsingSpring {
	public static void main(String[] args) {
		/* 1) BeanFactory : 사용시 생성됨
		Resource resource = new ClassPathResource("di1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		TV tv = (TV) factory.getBean("samsungtv");       //여기서 생성
		System.out.println(tv);
		tv.powerON();
		tv.powerOff();
		*/
		//2) ApplicationContext : 설정파일 로드시 생성됨
		ApplicationContext context = new ClassPathXmlApplicationContext("di1_d01.xml");//여기서 생성
		TV tv = (TV) context.getBean("samsungtv");
		System.out.println(tv);
		tv.powerON();
		tv.powerOff();
	}
}
