package com.api.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

 public	Student getByName(String name);

}
