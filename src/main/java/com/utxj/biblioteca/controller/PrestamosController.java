package com.utxj.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/biblioteca")
public class PrestamosController {
    @GetMapping("/prestamos")
    public String getMethodName() {
        return new String("Bienvenido a Prestamos.");
    }
    
}
