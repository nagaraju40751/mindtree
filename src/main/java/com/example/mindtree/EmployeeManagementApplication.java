package com.example.mindtree;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.service.mindtree.Employee;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee(101,"Gopi",25000));
		employee.add(new Employee(102,"naga",30000));
		employee.add(new Employee(103,"Raj",23000));
		employee.add(new Employee(104,"Siva",23000));
		employee.add(new Employee(105,"Pavan",23000));
		employee.add(new Employee(106,"Rakesh",23000));
		employee.add(new Employee(107,"vamsi",23000));
		employee.add(new Employee(108,"Raj",23000));
		employee.add(new Employee(109,"Raj",23000));
		employee.add(new Employee(110,"Raj",23000));
		for(Employee c:employee)
		{
			System.out.println(c);
		}
	}

}
