package com.example.sabanciedu.hw3.service;

import com.example.sabanciedu.hw3.model.Student;
import com.example.sabanciedu.hw3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public StudentRepository StudentRepository;

    public Student addNewStudent(Student Student) {
        return StudentRepository.save(Student);
    }

    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }

    public Student updateExistingStudent(Student Student) {
        return StudentRepository.save(Student);
    }

    public void deleteExistingStudent(Student Student) {
        StudentRepository.delete(Student);
    }

    public Optional<Student> getStudent(int id) {return StudentRepository.findById(id); }
}