package College.Details.Students.Info.Service;

import java.util.List;

import College.Details.Students.Info.Entity.University;

public interface UniversityService {

	University saveUniversity(University university);      //Post

	List<University> getdetails();                        //Get

}

