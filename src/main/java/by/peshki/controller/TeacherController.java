package by.peshki.controller;

import by.peshki.entity.Teacher;
import by.peshki.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    @Autowired
private TeacherService teacherService;
    @GetMapping
    public List<Teacher> getAllTeacher() {return teacherService.getAllTeacher();}
}
