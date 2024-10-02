package by.peshki.repository;

import by.peshki.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherJPARepository extends JpaRepository<Teacher,Integer> {
    Teacher getTeacherByFullName(String fullName);

}
