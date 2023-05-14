package com.example.Sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Sample.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	

}
