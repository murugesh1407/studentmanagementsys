package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRespository;

@SpringBootApplication
public class StudentManagementSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSysApplication.class, args);
	}
	
//	@Autowired
//	StudentRespository studentRespository;

//	@Override
//	public void run(String... args) throws Exception {
//		
//		Student s1 = new Student("Student1", "1", "stud1@gmail.com");
//		studentRespository.save(s1);
//		
//
//		Student s2 = new Student("Student2", "2", "stud2@gmail.com");
//		studentRespository.save(s2);
//		
//
//		Student s3 = new Student("Student3", "3", "stud3mail.com");
//		studentRespository.save(s3);
// 	}

}
