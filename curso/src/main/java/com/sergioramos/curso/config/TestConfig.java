package com.sergioramos.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sergioramos.curso.entities.User;
import com.sergioramos.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(1L, "Maria", "maria@gmail", "9999", "123456");
		User u2 = new User(2L, "Sergio", "sergio@gmail.com", "888", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
