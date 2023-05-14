package com.example.Sample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.Entity.Demo;
import com.example.Sample.Entity.Employee;
import com.example.Sample.Service.EmpService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmpService empService;
	
	@PostMapping("/EmpAdd")
	public Employee saveEmployee(@RequestBody Employee employee) {
	return empService.saveEmployee(employee);
	}
	
	@GetMapping("/EmpGetDetails")
	public List <Employee> getdetails(Employee emp) {
		return empService.details(emp);
		}
	
	@PostMapping("/EmpSaveAll")
    public List<Employee> saveAll(@RequestBody List<Employee> emp) {                        //PostSaveAll
		
		return empService.saveAll(emp);                                                     //PostSaveAll
	}
	
	@PatchMapping("/EmpReplace/{id}")
	public Employee replace(@RequestBody Employee emp,@PathVariable("id") int id) {
		
		return empService.replace(emp, id);
	}
	
	@DeleteMapping("/EmpDelete/{id}")
	public String deleting(@PathVariable("id") int id) {
		return empService.deleting(id);
	
	}

}
