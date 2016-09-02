package ua.com.skywell.authorization.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AuthorizationApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationApplication.class, args);
	}
}
