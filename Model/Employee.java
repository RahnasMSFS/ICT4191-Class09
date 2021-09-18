package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int EmpId;
	private String Name;
	private String Designation;
	private String Emptype;
	private String Date;
	@ManyToOne
	@JoinColumn(name="dept_id", referencedColumnName = "DeptId")
	private Department department;
	
	public Employee()
	{}

	public Employee(int empId, String name, String designation, String emptype, String date, Department department) {
		super();
		EmpId = empId;
		Name = name;
		Designation = designation;
		Emptype = emptype;
		Date = date;
		this.department = department;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getEmptype() {
		return Emptype;
	}

	public void setEmptype(String emptype) {
		Emptype = emptype;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
