package school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import school.entity.Student;


public interface Repository extends JpaRepository<Student, Long> {

}
