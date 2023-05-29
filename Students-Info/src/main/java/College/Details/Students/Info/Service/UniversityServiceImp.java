package College.Details.Students.Info.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import College.Details.Students.Info.Entity.University;
import College.Details.Students.Info.Repository.UniversityRepo;

@Service
public class UniversityServiceImp implements UniversityService {
	
	@Autowired
    private UniversityRepo universityRepo;
	
    @Override
	public University saveUniversity(University university) {
		return universityRepo.save(university);
	}

	@Override
	public List<University> getdetails() {                          //GetfindAll
		
		List<University> ul=universityRepo.findAll();
		return ul;
	}

}
