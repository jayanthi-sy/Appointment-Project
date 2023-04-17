package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Student;
@Service
public interface StudentService {
List<Student>getAllStudents();

}
