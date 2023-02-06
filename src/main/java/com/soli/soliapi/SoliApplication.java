package com.soli.soliapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoliApplication.class, args);
		System.out.println("Funcionando!");
	}

}
