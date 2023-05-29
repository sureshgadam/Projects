package College.Details.Students.Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import College.Details.Students.Info.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	
	@Query("Select s from Student s Where s.studentname = ?1")
	public Student findByname(String branchname);

}
