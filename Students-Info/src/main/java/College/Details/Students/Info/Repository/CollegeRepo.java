package College.Details.Students.Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import College.Details.Students.Info.Entity.College;

@Repository
public interface CollegeRepo extends JpaRepository<College, String>{

//	@Query("Select c from College c Where c.collegename = ?1")
//	public College findByname(String collegename);
	
		
}
