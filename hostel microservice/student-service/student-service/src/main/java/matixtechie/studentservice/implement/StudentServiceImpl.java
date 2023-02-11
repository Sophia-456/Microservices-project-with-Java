package matixtechie.studentservice.implement;

import matixtechie.studentservice.model.Student;
import matixtechie.studentservice.repository.StudentRepository;
import matixtechie.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long studentId) {
        return Optional.of(studentRepository.findById(studentId).get());
    }
}
