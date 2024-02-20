package com.utxj.biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca/libros")
public class LibrosController {

    @GetMapping("/novelas/{folio}/{titulo}/{autor}/{editorial}")
    public String getNovela(@PathVariable Integer folio, @PathVariable String titulo, @PathVariable String autor, @PathVariable String editorial) {
        String newNovela = "Folio: " + folio + "\n  " + "Título: " + titulo + "\n " + "Autor: " + autor + "\n   " + "Editorial: " + editorial;
        return newNovela;
    }

    @GetMapping("/cuentos/{folio}/{titulo}/{autor}/{editorial}")
    public String getCuento(@PathVariable Integer folio, @PathVariable String titulo, @PathVariable String autor, @PathVariable String editorial) {
        String newCuento = "Folio: " + folio + "\n  " + "Título: " + titulo + "\n " + "Autor: " + autor + "\n   " + "Editorial: " + editorial;
        return newCuento;
    }
}
