package com.example.Sample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Sample.Entity.Demo;

@Repository
public interface DemoRepo extends JpaRepository<Demo, Integer> {
	
	@Query("SELECT t FROM Demo  t WHERE t.name=?1")    
	public List<Demo> findByIdName(String name);                                    //Query GetName

	
//	@Query(value = "SELECT * FROM Sample  t WHERE t.name=?1",nativeQuery=true)      //nativeQuery GetName
//	public List<Demo> findByIdName(String name);
	
}
 