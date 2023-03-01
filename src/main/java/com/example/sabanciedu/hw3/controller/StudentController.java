package com.example.sabanciedu.hw3.controller;

import com.example.sabanciedu.hw3.model.Student;
import com.example.sabanciedu.hw3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    // Dependency Injection
    // IoC --> Inversion of Controller
    @Autowired
    private StudentService StudentService;

    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return StudentService.getAllStudents();
    }

    @GetMapping("/Students/{id}")
    public Optional<Student> getStudent(@PathVariable int id){
        return StudentService.getStudent(id);
    }

    @PostMapping("/Students")
    public Student addNewStudent(@RequestBody Student Student){
        return StudentService.addNewStudent(Student);
    }

    @PutMapping("/Students")
    public Student updateExistingStudent(@RequestBody Student Student){
        return StudentService.updateExistingStudent(Student);
    }

    @DeleteMapping("/Students")
    public void deleteExistingStudent(@RequestBody Student Student){
        StudentService.deleteExistingStudent(Student);
    }
}