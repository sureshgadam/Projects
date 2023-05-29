package College.Details.Students.Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import College.Details.Students.Info.Entity.University;

@Repository
public interface UniversityRepo extends JpaRepository<University, String>{

}
