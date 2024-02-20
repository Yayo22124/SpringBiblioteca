package com.utxj.biblioteca.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BibliotecaController {
    @GetMapping("/biblioteca")
    public String getSaludo() {
        return new String("Bienvenid@ a la Biblioteca de la Universidad");
    }
    
}
