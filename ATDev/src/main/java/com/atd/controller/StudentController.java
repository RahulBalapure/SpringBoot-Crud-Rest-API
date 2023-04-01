package com.atd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atd.model.Student;
import com.atd.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;

	@GetMapping(value = "findAllStudents")
	public List<Student> findAllStudents123() {

		return ss.findAllStudent();
	}
	
	
	@PostMapping(value = "insertStudent")
	public Student m6( @RequestBody Student s) {
		return ss.insertStudent(s);
	}

	
	@GetMapping(value = "findStudentById/{id}")
	public Student findStudent123(@PathVariable("id") int id) {
		
		return ss.findStudentById(id);

	}

	@DeleteMapping(value = "deleteStudentById/{id}")
	public int deleteStudent123(@PathVariable int id) {
		
		return ss.deleteStudentById(id);
	}


	@PutMapping(value = "updateStudentById")
	public Student updateStudent123(@RequestBody Student s) {
		return ss.insertStudent(s);
	}

}
