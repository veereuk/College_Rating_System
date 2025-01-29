package com.demo.controller;



import com.demo.college.entity.Student;
import com.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return studentService.login(email, password);
    }

//    @PostMapping("/register")
//    public String register(@RequestBody Student student) {
//        return studentService.register(student);
//    }
    
    @PostMapping("/register")
    public String register(@RequestBody Student student) {
        String result = studentService.register(student);
        return result;  // You can return this as a message or JSON response
    }
    

   


}
