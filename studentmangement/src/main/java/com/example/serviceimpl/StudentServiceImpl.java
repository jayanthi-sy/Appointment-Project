package com.example.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import com.example.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
