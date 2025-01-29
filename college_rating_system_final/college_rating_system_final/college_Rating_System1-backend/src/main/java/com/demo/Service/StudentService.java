package com.demo.Service;

import com.demo.college.entity.Student;
import com.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String login(String email, String password) {
        Optional<Student> student = studentRepository.findByEmail(email);
        if (student.isPresent() && student.get().getPassword().equals(password)) {
            return "Login successful!";
        }
        return "Invalid email or password!";
    }

    public String register(Student student) {
        if (studentRepository.findByEmail(student.getEmail()).isPresent()) {
            return "Email is already registered!";
        }
        studentRepository.save(student);
        return "Registration successful!";
    }
}
