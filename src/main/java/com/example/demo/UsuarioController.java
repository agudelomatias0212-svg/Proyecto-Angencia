package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping("/saludo")
    public String saludar() {
        return "Hola, este es mi primer controlador";
    }

    @GetMapping("/despedida")
    public String despedida() {
        return "Adios";
    }

}
