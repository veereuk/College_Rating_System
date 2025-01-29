package com.demo.controller;
import com.demo.college.entity.SignUp;
import com.demo.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signup")
    public String handleSignUp(@ModelAttribute SignUp signUp, Model model) {
        if (!signUp.getPassword().equals(signUp.getPassword())) {
            model.addAttribute("error", "Passwords do not match!");
            return "signup"; // Return to the sign-up page with an error
        }

        boolean isSaved = signUpService.saveSignUp(signUp);
        if (!isSaved) {
            model.addAttribute("error", "Email is already registered!");
            return "signup";
        }

        return "redirect:/success"; // Redirect to success page
    }
   
    
}
