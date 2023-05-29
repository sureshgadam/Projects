package College.Details.Students.Info.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import College.Details.Students.Info.Entity.College;
import College.Details.Students.Info.Entity.Student;
import College.Details.Students.Info.Repository.CollegeRepo;
import College.Details.Students.Info.Repository.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}
	
//	private StudentRepo studentRepo;
//	private CollegeRepo collegeRepo;
//	
//	
//	public StudentServiceImp(StudentRepo studentRepo, CollegeRepo collegeRepo) {
//		super();
//		this.studentRepo = studentRepo;
//		this.collegeRepo = collegeRepo;
//	}
//
//
//	@Override
//	public Student saveStudent(Student student,String Collegename) {
//		College existing = collegeRepo.findByname(Collegename);
//		if((existing.getCollegename()).equals(Collegename));
//		student.setBranchname(Collegename);
//		return studentRepo.save(student);
//	}

}
