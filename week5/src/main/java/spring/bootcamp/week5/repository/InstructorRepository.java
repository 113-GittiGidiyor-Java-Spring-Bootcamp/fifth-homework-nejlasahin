package spring.bootcamp.week5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.bootcamp.week5.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    boolean existsByPhoneNumber(String phoneNumber);
}
