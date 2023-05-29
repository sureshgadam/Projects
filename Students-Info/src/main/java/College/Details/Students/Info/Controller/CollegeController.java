package College.Details.Students.Info.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import College.Details.Students.Info.Entity.College;
import College.Details.Students.Info.Service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping("/College")
	public College saveCollege(@RequestBody College college) {
		return collegeService.saveCollege(college);
	}
	
	@GetMapping("/CollegeId/{id}")
	public Optional<College> getdetails(@PathVariable("id") String id){
		return collegeService.getdetails(id);
	}
	
}
