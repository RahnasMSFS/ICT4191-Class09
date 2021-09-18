package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Employee;
import lk.ac.vau.Repo.EmployeeRepo;

@RequestMapping("/employee")
@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepo context;
	
	@GetMapping
	public List<Employee> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable("id") Integer EmpId)
	{
		return context.findById(EmpId).get();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer EmpId)
	{
		context.deleteById(EmpId);
	}
	
	@PostMapping
	public void add(@RequestBody Employee employee)
	{
		context.save(employee);
	}
}