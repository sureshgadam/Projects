package com.example.Sample.Service;

import java.util.List;

import com.example.Sample.Entity.Employee;

public interface EmpService {
	
	Employee saveEmployee(Employee employee);                 //EmpPOST           

	List<Employee>details(Employee emp);                      //EmpGetDetails

	List<Employee> saveAll(List<Employee> emp);              //PostSaveAll

	Employee replace(Employee emp, int id);                 //Replace (Patch)

	String deleting(int id);                                 //EmpDeleting

}
