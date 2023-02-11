package matixtechie.studentservice.controller;

import lombok.AllArgsConstructor;
import matixtechie.studentservice.model.Student;
import matixtechie.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/students")
@AllArgsConstructor
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        Student savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") Long studentId){
        Optional<Student> student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }
}

