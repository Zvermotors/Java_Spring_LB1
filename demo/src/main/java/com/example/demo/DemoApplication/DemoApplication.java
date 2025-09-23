package com.example.demo.DemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {
		//"com.example.musicstore.configurations",
		//"com.example.musicstore.models",
		"com.example.demo.controllers",
		//"com.example.musicstore.services",
	//	"com.example.musicstore.repositories",

})
//@EnableJpaRepositories("com.example.musicstore.repositories")  // ← Добавьте это
//@EntityScan("com.example.musicstore.models")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
