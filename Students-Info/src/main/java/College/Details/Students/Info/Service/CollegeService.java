package College.Details.Students.Info.Service;

import java.util.Optional;

import College.Details.Students.Info.Entity.College;

public interface CollegeService {

	College saveCollege(College college);

	Optional<College> getdetails(String id);
	
}
