package br.com.vittor.projectspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.vittor")
public class ProjectSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringbootApplication.class, args);
	}

}
