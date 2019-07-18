package springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springboot.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAll();
}
