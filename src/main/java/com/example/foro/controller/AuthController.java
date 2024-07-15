package com.example.foro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public ResponseEntity<?> authenticate(@RequestBody AuthRequest authRequest) {
        // Lógica de autenticación (puedes expandir esta sección según tu necesidad)
        return ResponseEntity.ok(new AuthResponse("eyJhbGciOiJIUzI1NiJ9", "Bearer"));
    }
}

class AuthRequest {
    public String email;
    public String contrasena;
}

class AuthResponse {
    public String token;
    public String type;

    public AuthResponse(String token, String type) {
        this.token = token;
        this.type = type;
    }
}
