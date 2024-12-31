package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class SignInController {

    @GetMapping("/signin")
    public String showSignInForm() {
        return "signin";
    }

    @PostMapping("/signin")
    public String signIn(@RequestParam("username") String username, @RequestParam("password") String password,
            Model model) {
        // Add your sign-in logic here
        model.addAttribute("username", username);
        return "welcome";
    }
}