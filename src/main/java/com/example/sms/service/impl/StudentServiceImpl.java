package com.example.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRespository;
import com.example.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRespository studentRespository;

	@Override
	public List<Student> getAllStudents() {
		return studentRespository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRespository.save(student);
	}

	@Override
	public Student getStudentById(Long studentId) {

		return studentRespository.findById(studentId).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRespository.save(student);
	}

	@Override
	public void deleteStudentById(Long studentId) {
		studentRespository.deleteById(studentId);
		
	}

	
}
