package com.example.Sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.Entity.Demo;
import com.example.Sample.Repository.DemoRepo;
import com.example.Sample.Service.DemoService;

@RestController
@RequestMapping("/Demo")
public class DemoController {

	@Autowired
	DemoService demoService;
	
	
	public DemoController(DemoService demoService) {
		super();
		this.demoService = demoService;
	}

	@PostMapping("/Add")
	public Demo saveDemo(@RequestBody Demo demo) {
	return demoService.saveDemo(demo);
	}
	
	@GetMapping("/GetDetails")
	public List <Demo> getdetails( Demo demo) {
		return demoService.getdetails(demo);
		}
	
//	@GetMapping("/FindSingleId/{id}")
//	public Optional<Demo> getdetails(@PathVariable("id") int id){
//		return demoService.getdetails(id);
//	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleting(@PathVariable("id") int id) {
		return demoService.deleting(id);
	
	}
	
	@PutMapping("/Update/{id}")
	public Demo updating(@RequestBody Demo demo,@PathVariable("id") int id) {
		return demoService.updating(demo,id);
	}
	
	@PatchMapping("/Replace/{id}")
	public Demo replace(@RequestBody Demo demo,@PathVariable("id") int id) {
		
		return demoService.replace(demo, id);
	}
	
//	@GetMapping("/Findname/{name}")
//   public List<Demo> findByIdName(@PathVariable String name) {            //Query GetName
//		
//		return demoService.findByIdName(name);                              //Query GetName
//	}
	
	@PostMapping("/SaveAll")
     public List<Demo> saveAll(@RequestBody List<Demo> demo) {             //PostSaveAll
		
		return demoService.saveAll(demo);                                  //PostSaveAll
	}
	
}
