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

import lk.ac.vau.Model.Department;
import lk.ac.vau.Repo.DepartmentRepo;

@RestController
@RequestMapping("/department")
public class DepartmentController
{
	@Autowired
	DepartmentRepo context;
	
	@GetMapping
	public List<Department> getAll()
	{
		return context.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer DeptId)
	{
		context.deleteById(DeptId);
	}
	
	@PostMapping
	public void add(@RequestBody Department department)
	{
		context.save(department);
	}
}