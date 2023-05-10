package com.example.Sample.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sample.Entity.Demo;
import com.example.Sample.Repository.DemoRepo;

@Service
public class DemoServiceImp implements DemoService {
	
	@Autowired
	private DemoRepo demoRepo;
	
	public Demo saveDemo(Demo demo) {              //Post
		return demoRepo.save(demo);                //Post
	}

//	@Override
//	public List<Demo> getdetails(Demo demo) {      //Get
//		return null;                               //Get
//	}

	public List<Demo> getdetails(Demo demo) {      //GetFindAll
	
	return demoRepo.findAll();                     //GetFindAll
	}
	
//	@Override
//	public Optional<Demo> getdetails(int id) {     //GetFindById
//		return demoRepo.findById(id);              //GetFindById
//	}

	@Override
	public String deleting(int id) {               //Delete
		 demoRepo.deleteById(id);                  //Delete
		 return "Record Delete Succesfull";        //Delete
	}

	@Override
	public Demo updating(Demo demo, int id) {
		Demo update = demoRepo.findById(id).get();
			
		//update.setNumber(demo.getNumber());
		update.setName(demo.getName());	
		update.setLocation(demo.getLocation());
		update.setPhonenumber(demo.getPhonenumber());
		
		return demoRepo.save(update);
	
	}

}
