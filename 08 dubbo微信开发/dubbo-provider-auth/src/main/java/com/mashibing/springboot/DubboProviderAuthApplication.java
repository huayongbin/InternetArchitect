package com.mashibing.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.mashibing.springboot.mapper")
public class DubboProviderAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderAuthApplication.class, args);
	}

}
