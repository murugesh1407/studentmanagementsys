package com.example.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sms.entity.Student;
import com.example.sms.service.StudentService;

@Controller
public class StudentConroller {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	private String getAllStudents(Model model) {

		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createNewStudentForm(Model model) {
		
		//Created new object to hold the data from form
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String updateExistingStudentFom( @PathVariable("id") Long studentId, Model model) {
		model.addAttribute("student",studentService.getStudentById(studentId));
		return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable("id") Long StudentId,
			@ModelAttribute("student") Student student) {
		
		Student existingStudent = studentService.getStudentById(StudentId);
		
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudentForId( @PathVariable("id") Long studentId) {
		studentService.deleteStudentById(studentId);
		return "redirect:/students";
	}
}
