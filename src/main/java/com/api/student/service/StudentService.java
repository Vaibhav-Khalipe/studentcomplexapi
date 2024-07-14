package com.api.student.service;

import com.api.student.entities.Student;

public interface StudentService {

public	Student saveStudent(Student student);

public Student getStudentByName(String name);

}
