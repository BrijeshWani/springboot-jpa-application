package springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springboot.entity.Employee;

@Component
public class JDBCTemplateManager {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Employee getEmployee(final Long employeeId) {
		// Some stuffs with JDBCTemplates
		return null;
	}

}
