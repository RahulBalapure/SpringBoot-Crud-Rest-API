package com.atd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atd.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	List<Student> findAll();

	Student findStudnetById(int id);

	int deleteStudentById(int id);

}
