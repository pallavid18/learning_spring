package com.aop.pro.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {
	
/**com.aop.pro.service.*.*(..)
*--> any return type 
com.aop.pro.service--> package name 
*--> any class from that package 
*-->any method from that class
(..)-->method with any number of parameter 
*/
	@Before("execution(* com.aop.pro.service.*.*(..))")
	public void beforeLog() {
		System.out.println("Before Logging method execution.");
	}
	
	@After("execution(* com.aop.pro.service.*.*(..))")
	public void afterLog() {
		System.out.println("After Payment process execution.");
	}
	
	@Around("execution(* com.aop.pro.service.*.*(..))")
	public void afterLogBefore() {
		System.out.println("After and Before ");
	}

}
