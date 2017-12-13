package com.example.demo1204.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SenAspect {
	@Pointcut("execution(public * com.example.demo1204.controller..*.*(..))")
	  public void webLog(){}
    @After("webLog())")
    /*public void ddd(Pointcut pointcut) {
    	System.out.println("dddd");
    }*/
    public void ddd(JoinPoint joinPoint) {
		System.out.println("ddddddddddddddd");
	}
	
}
