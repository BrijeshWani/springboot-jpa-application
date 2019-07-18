# springboot-jpa-application
This project explains springboot + mysql database connectivity.

## Properties to be used for JPA configuration

```
spring.datasource.url: jdbc:mysql://host/test
spring.datasource.username: test
spring.datasource.password: test
spring.datasource.driver-class-name: com.mysql.jdbc.Driver

spring.jpa.hibernate.ddl-auto: update
```

## JDBC template with springboot
You can access JDBC template using below code,

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JDBCBean {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCBean(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
```

## Using native queries
Native queries can be used with JPA repository using @Query annotation as below,

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springboot.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAll();
}
```