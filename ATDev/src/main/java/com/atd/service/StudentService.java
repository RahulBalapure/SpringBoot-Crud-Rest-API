package com.atd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atd.dao.StudentRepository;
import com.atd.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository sr;

	public List<Student> findAllStudent() {

		return sr.findAll();
	}

	public Student findStudentById(int id) {

		return sr.findStudnetById(id);
	}

	public int deleteStudentById(int id) {

		return sr.deleteStudentById(id);
	}

	public Student insertStudent(Student s) {

		return sr.save(s);
	}

	public Student updateStudent(Student s) {

		return sr.save(s);
	}

}
