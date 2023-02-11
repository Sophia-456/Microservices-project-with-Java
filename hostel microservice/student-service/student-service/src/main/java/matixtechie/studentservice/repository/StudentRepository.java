package matixtechie.studentservice.repository;

import matixtechie.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
