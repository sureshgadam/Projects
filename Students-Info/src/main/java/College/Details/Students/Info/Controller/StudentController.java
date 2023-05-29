package College.Details.Students.Info.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import College.Details.Students.Info.Entity.Student;
import College.Details.Students.Info.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/Student")
	private Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
//	@PostMapping("/Student")
//	public Student saveStudent(@RequestBody Student student,String Collegename) {
//		return studentService.saveStudent(student,Collegename);
//	}

}
