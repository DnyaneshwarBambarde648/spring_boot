package com.hibernat_mappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hibernat_mappings.service.EmpService;

@SpringBootApplication
public class JpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaOneToManyApplication.class, args);
	EmpService service = context.getBean(EmpService.class);
	//service.saveEmp();
	//service.getEmo();
	service.getAddress();
	
	}

}
