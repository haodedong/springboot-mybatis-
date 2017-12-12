package com.example.demo1204.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

@Aspect
@Configuration
@EnableAspectJAutoProxy
@Component
public class AspectDemo {
	//private Logger log = LoggerFactory.getLogger(AspectDemo.class);
	
	@Pointcut("execution(* com.example.demo1204.controller.*.*(..))")
	private void controllerAspect() {
		
	}
	@Before(value ="controller()")
	public void methodBefore(Joinpoint joinpoint) {
		System.out.println("controller has do--------------------dddddddd");
	}
}
