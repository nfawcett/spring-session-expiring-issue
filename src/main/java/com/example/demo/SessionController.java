package com.example.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    // curl
    // GET http://localhost:9009/check-session
    @GetMapping("/check-session")
    public String checkSession(HttpSession session) {

        System.out.println("session id: " + session.getId());
        System.out.println("session ttl: " + session.getMaxInactiveInterval());

        return "Test";
    }

}
