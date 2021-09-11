package com.myAPI.com.apisql.repository;

import org.springframework.data.repository.CrudRepository;

import com.myAPI.com.apisql.model.Employee;



public interface EmployeeRepository  extends CrudRepository<Employee, Long>{

}
