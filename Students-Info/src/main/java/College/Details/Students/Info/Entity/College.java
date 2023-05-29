package College.Details.Students.Info.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "Code")
		private String code;
		
		@Column(name="collegename")
		private String collegename;
		
		@Column(name = "branchname")
		private String branchname;
		
		@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn
		private List<Student> student;
		
		public College () {
			super();
		}

		public College(String code, String collegename, String branchname, List<Student> student) {
			super();
			this.code = code;
			this.collegename = collegename;
			this.branchname = branchname;
			this.student = student;                     
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getCollegename() {
			return collegename;
		}

		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}

		public String getBranchname() {
			return branchname;
		}

		public void setBranchname(String branchname) {
			this.branchname = branchname;
		}

		public List<Student> getStudent() {                       
			return student;
		}

		public void setStudent(List<Student> student) {        
			this.student = student;
		}

		@Override
		public String toString() {
			return "College [code=" + code + ", collegename=" + collegename + ", branchname=" + branchname
					+ ", student=" + student + "]";
		}
		
		
					
}
