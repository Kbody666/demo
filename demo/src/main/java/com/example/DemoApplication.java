package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描mybatis mapper包路径
@MapperScan(basePackages="com.example.mapper")
//扫描所有需要的包，包含一些自用的工具类包所在的路径
@ComponentScan(basePackages= {"com.example"})
//定时任务的注解
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
