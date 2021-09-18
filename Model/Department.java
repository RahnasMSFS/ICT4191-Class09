package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id
	private int DeptId;
	private String Name;
	private String Faculty;
	private int NoofStaff;
	@OneToMany(mappedBy = "department")
	//@JoinColumn(name="dept_id", referencedColumnName = "DeptId")
	public List<Employee> employees;
	
	public Department()
	{}

	public Department(int deptId, String name, String faculty, int noofStaff, List<Employee> employees) {
		super();
		DeptId = deptId;
		Name = name;
		Faculty = faculty;
		NoofStaff = noofStaff;
		this.employees = employees;
	}

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFaculty() {
		return Faculty;
	}

	public void setFaculty(String faculty) {
		Faculty = faculty;
	}

	public int getNoofStaff() {
		return NoofStaff;
	}

	public void setNoofStaff(int noofStaff) {
		NoofStaff = noofStaff;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
