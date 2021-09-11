package com.myAPI.com.apisql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(name="first_name")
	 private String firstName;

	 @Column(name="last_name")
	 private String lastName;

	 private String mail;

	 private String password;
	 
	 

	

		/*
		 * public Employee(String firstName, String lastName, String mail, String
		 * password) { super(); this.firstName = firstName; this.lastName = lastName;
		 * this.mail = mail; this.password = password; }
		 */

	
	 
	 

}
