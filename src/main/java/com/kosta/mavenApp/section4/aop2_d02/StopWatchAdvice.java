package com.kosta.mavenApp.section4.aop2_d02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class StopWatchAdvice{
	
	@Pointcut("execution(* d*(int))")
	public void targetMethod() {
		
	}
	
	@Around("targetMethod()")
	public Object aa(ProceedingJoinPoint jp) throws Throwable {
		//보조업무
		System.out.println("******" + jp.getSignature().getName() + "메서드 호출 전(StopWatchAdvice)");
		StopWatch watch = new StopWatch("계산시간");
		watch.start();
		//주업무를 수행한다. 
		Object object = jp.proceed();
		//보조업무
		System.out.println("*****" + jp.getSignature().getName() + "메서드 호출 후(StopWatchAdvice)");
		watch.stop();
		System.out.println("주업무를 수행하는데 걸리는 시간:" + watch.getTotalTimeMillis());
		System.out.println(watch.prettyPrint());
		return object;
	}
}
