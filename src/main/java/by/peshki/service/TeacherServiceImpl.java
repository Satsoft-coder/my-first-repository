package by.peshki.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import by.peshki.entity.Teacher;
import by.peshki.repository.TeacherJPARepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherJPARepository repository;

    @Override
    public List<Teacher> getAllTeacher() {
        return repository.findAll();
    }
}
