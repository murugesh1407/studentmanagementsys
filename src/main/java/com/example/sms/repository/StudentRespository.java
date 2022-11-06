package com.example.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long> {

}
