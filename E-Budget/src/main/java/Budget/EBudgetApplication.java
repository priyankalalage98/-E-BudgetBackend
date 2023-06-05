package Budget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EBudgetApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EBudgetApplication.class, args);
		System.out.println("*******E-Budget application Running successfully*******");

	}
	
	
	
}