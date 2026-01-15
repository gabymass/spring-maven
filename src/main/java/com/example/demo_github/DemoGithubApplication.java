package com.example.demo_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; // Ajout requis
import org.springframework.web.bind.annotation.RestController; // Ajout requis

@SpringBootApplication
public class DemoGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGithubApplication.class, args);
    }

}

// Simple contrôleur REST ajouté à la suite 
@RestController
class HelloWorldController {
    
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!"; // Renvoie "Hello, World!" au navigateur [cite: 12]
    }
}
