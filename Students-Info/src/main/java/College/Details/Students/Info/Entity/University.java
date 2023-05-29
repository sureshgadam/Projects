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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="University")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

public class University {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="code")
	private String code;
	
	@Column(name="universityname")
	private String universityname;
	
	@Column
	private String location;
	
	@Column
	private String dist;
	
	
//	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JoinColumn
//	private College college;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn
	private  List<College> college;
	
	public University() {
		super();
	}

	public University(String code, String universityname, String location, String dist, List<College> college) {
		super();
		this.code = code;
		this.universityname = universityname;
		this.location = location;
		this.dist = dist;
		this.college = college;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "University [code=" + code + ", universityname=" + universityname + ", location=" + location + ", dist="
				+ dist + ", college=" + college + "]";
	}

}
