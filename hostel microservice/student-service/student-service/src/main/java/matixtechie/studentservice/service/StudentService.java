package matixtechie.studentservice.service;

import matixtechie.studentservice.model.Student;

import java.util.Optional;


public interface StudentService {
     Student saveStudent(Student student);

     Optional<Student> getStudentById(Long studentId);
}
