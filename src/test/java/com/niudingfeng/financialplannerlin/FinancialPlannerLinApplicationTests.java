package com.niudingfeng.financialplannerlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinancialPlannerLinApplicationTests {
	@Autowired
	DataSource dataSource;
	@Test
	public void contextLoads() {
		System.out.println(dataSource+"------------------------");
	}

}
