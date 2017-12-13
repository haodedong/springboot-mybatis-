package com.example.demo1204.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component

public class AspectDemo {
	//private Logger log = LoggerFactory.getLogger(AspectDemo.class);
	
	@Pointcut("execution(public * com.example.demo1204.controller..*.*(..))")
    public void webLog(){}
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
		System.out.println("before");
	}
	/*@Pointcut("execution(public * com.example.demo1204.controller..*.*(..))")
    public void webLog(){}
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
    	System.out.println("dsfas");
    }*/
    
}
