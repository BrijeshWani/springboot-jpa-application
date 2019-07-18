package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springboot.repo.EmployeeRepo;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = { EmployeeRepo.class })
public class SpringbootClient {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootClient.class, args);
	}
}