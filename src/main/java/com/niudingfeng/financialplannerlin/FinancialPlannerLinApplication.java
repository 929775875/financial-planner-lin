package com.niudingfeng.financialplannerlin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.niudingfeng.financialplannerlin.mapper")
public class FinancialPlannerLinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialPlannerLinApplication.class, args);
	}
}
