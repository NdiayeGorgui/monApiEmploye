package com.myAPI.com.apisql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myAPI.com.apisql.model.Employee;
import com.myAPI.com.apisql.service.EmployeeService;

@SpringBootApplication
public class ApisqlApplication /* implements CommandLineRunner */{

	
	/*
	 * @Autowired EmployeeService employeeService;
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApisqlApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * employeeService.saveEmployee(new
	 * Employee("gogo","ndiaye","gogo@gmail.com","toufah"));
	 * employeeService.saveEmployee(new
	 * Employee("fatou","djibo","fatou@gmail.com","toufah1"));
	 * employeeService.saveEmployee(new
	 * Employee("papi","ndiaye","papi@gmail.com","toufah2"));
	 * employeeService.saveEmployee(new
	 * Employee("jules","ndiaye","jules@gmail.com","toufah3"));
	 * 
	 * }
	 */

}
