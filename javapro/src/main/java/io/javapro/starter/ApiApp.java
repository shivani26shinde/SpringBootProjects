package io.javapro.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApp {
	
	public static void main(String[] args){
		SpringApplication.run(ApiApp.class, args); //Calling a static method and passing name of the class
	}
}
