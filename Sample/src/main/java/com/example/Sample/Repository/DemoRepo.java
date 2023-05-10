package com.example.Sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Sample.Entity.Demo;

@Repository
public interface DemoRepo extends JpaRepository<Demo, Integer> {

}
 