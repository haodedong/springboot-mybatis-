package com.example.demo1204;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo1204.mapper")
public class Demo1204Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1204Application.class, args);
	}
}
