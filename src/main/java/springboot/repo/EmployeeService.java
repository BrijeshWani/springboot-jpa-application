package springboot.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Transactional(readOnly = false)
	public Employee save(final Employee employee) {
		return employeeRepo.save(employee);
	}

	@Transactional(readOnly = true)
	public List<Employee> getAll() {
		return employeeRepo.getAll();
	}
}
