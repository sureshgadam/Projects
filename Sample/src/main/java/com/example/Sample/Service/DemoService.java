package com.example.Sample.Service;

import java.util.List;
import java.util.Optional;

import com.example.Sample.Entity.Demo;

public interface DemoService {
	
	Demo saveDemo(Demo demo);                //Post
	
	List<Demo> getdetails(Demo demo);        //Get & Get FindByAll

	//Optional<Demo> getdetails(int id);       //Get FindById

	String deleting(int id);                 //Delete

	Demo updating(Demo demo, int id);        //Update
	

}
