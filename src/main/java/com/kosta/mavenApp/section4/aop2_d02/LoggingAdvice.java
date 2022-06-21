package com.kosta.mavenApp.section4.aop2_d02;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Advice : 보조업무
@Component
@Aspect
public class LoggingAdvice {
	@Pointcut("execution(* add(int)) || execution(* add(int,int))")
	public void targetMethod() {
		
	}
	@Around("targetMethod()")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		//1.
		System.out.println("[주업무전에 수행]" + jp.getSignature().getName() + "함수 호출전");
		//2.before
		//3.주업무
		Object obj = jp.proceed(); //주업무 호출하기
		//4.AfterReturning
		//5.After
		System.out.println("[주업무후에 수행]" + jp.getSignature().getName() + "함수 호출후");
		return obj;
		
	}
	@Before("targetMethod()")
	public void test(JoinPoint jp) {
		System.out.println("Before" + jp.getSignature().getName());
	}
	@After("targetMethod()")
	public void test2(JoinPoint jp) {
		System.out.println("After" + jp.getSignature().getName());
	}
	@AfterReturning("targetMethod()")
	public void test3(JoinPoint jp) {
		System.out.println("AfterReturning" + jp.getSignature().getName());
	}
}
