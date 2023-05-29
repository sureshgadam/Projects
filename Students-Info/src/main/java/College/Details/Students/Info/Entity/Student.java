package College.Details.Students.Info.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String branchname;
	
	@Column
	private Long rollnum;
	
	@Column
	private String studentname;
	
	@Column
	private String subject;
	
	public Student() {
		super();
	}

	public Student(Long id, String branchname, Long rollnum, String studentname, String subject, College college) {
		super();
		this.id = id;
		this.branchname = branchname;
		this.rollnum = rollnum;
		this.studentname = studentname;
		this.subject = subject;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Long getRollnum() {
		return rollnum;
	}

	public void setRollnum(Long rollnum) {
		this.rollnum = rollnum;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", branchname=" + branchname + ", rollnum=" + rollnum + ", studentname="
				+ studentname + ", subject=" + subject + "]";
	}	

	
}
