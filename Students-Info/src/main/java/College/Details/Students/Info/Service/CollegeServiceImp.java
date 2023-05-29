package College.Details.Students.Info.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import College.Details.Students.Info.Entity.College;
import College.Details.Students.Info.Repository.CollegeRepo;

@Service
public class CollegeServiceImp implements CollegeService {
	
		@Autowired
		private CollegeRepo collegeRepo;
		
		@Override
		public College saveCollege(College college) {
			
			return collegeRepo.save(college);
		}

		
		public Optional<College> getdetails(String id) {
			
			return collegeRepo.findById(id);
		}

}


