package College.Details.Students.Info.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import College.Details.Students.Info.Entity.University;
import College.Details.Students.Info.Service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	UniversityService universityService;
	
	@PostMapping("/University")
	public University saveUniversity(@RequestBody University university) {
	return universityService.saveUniversity(university);
	}
	
	@GetMapping("/GetUni")
	public List <University> getdetails() {
		return universityService.getdetails();
		}

}
