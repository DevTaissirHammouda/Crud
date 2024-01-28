package io.tut.spring.Crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.tut.spring.Crud.CrudControl", "Service", "Model"})
public class CrudApplication {

	public static void main(String[] args) {


		SpringApplication.run(CrudApplication.class, args);
	}

}
