package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication()
public class StudentmangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmangementApplication.class, args);
	}
private StudentRepository studentRepository;
	
}
