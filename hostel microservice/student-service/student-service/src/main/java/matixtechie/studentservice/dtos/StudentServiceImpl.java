package matixtechie.studentservice.dtos;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import matixtechie.studentservice.model.Student;
import matixtechie.studentservice.repository.StudentRepository;
import matixtechie.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

        private StudentRepository studentRepository;
        public Student saveStudent(Student student){
            return studentRepository.save(student);
        }
        public Optional<Student> getStudentById(Long studentId){
            return studentRepository.findById(studentId);
        }
}
