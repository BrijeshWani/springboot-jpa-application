package springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.entity.Employee;
import springboot.repo.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/")
	public ResponseEntity<Employee> test(final @RequestBody Employee employee) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.save(employee));
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAll());
	}
}
