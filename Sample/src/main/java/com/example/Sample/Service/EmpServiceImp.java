package com.example.Sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sample.Entity.Demo;
import com.example.Sample.Entity.Employee;
import com.example.Sample.Repository.EmpRepo;

@Service
public class EmpServiceImp implements EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	public Employee saveEmployee(Employee employee) {                         //EmpPOST
		return empRepo.save(employee);                                        //EmpPOST
	}

	@Override
	public List<Employee> details(Employee emp) {                             //EmpGetDetails
		return empRepo.findAll();                                             //EmpGetDetails
	}

	@Override
	public List<Employee> saveAll(List<Employee> emp) {                      //PostSaveAll
		
		return empRepo.saveAll(emp);                                         //PostSaveAll
	}

	@Override
	public Employee replace(Employee emp, int id) {
		Employee replace = empRepo.findById(id).get();
		replace.setEmail(emp.getEmail());
		replace.setSalary(emp.getSalary());
		return empRepo.save(replace);
		
	}

	@Override
	public String deleting(int id) {
		empRepo.deleteById(id); 
		return "Delete ById Succesfully";
	}

}
