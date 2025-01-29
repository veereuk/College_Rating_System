package com.demo.Service;


import com.demo.college.entity.SignUp;

import com.demo.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private SignUpRepository signUpRepository;

    public boolean saveSignUp(SignUp signUp) {
    	 if (signUp.getFullName() == null || signUp.getFullName().trim().isEmpty()) {
             throw new IllegalArgumentException("Full name cannot be null or empty");
         }
        // Check if email already exists
        if (signUpRepository.existsByEmail(signUp.getEmail())) {
            return false;
        }
        signUpRepository.save(signUp);
        return true;
    }
}

