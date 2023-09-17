package com.example.din.SpringAndTelegramProject;

import com.example.din.SpringAndTelegramProject.impl.UserServiceImpl;
import com.example.din.SpringAndTelegramProject.repositories.UserRepositories;
import com.example.din.SpringAndTelegramProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringAndTelegramProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringAndTelegramProjectApplication.class, args);
	}

}
