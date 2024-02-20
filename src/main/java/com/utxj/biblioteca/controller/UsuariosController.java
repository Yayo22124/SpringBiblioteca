package com.utxj.biblioteca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/biblioteca/usuarios")
public class UsuariosController {

    @GetMapping("/trabajador/{numTrabajador}/{nombre}/{apellidoP}/{apellidoM}/{area}")
    public String getTrabajador(@PathVariable Integer numTrabajador, @PathVariable String nombre, @PathVariable String apellidoP, @PathVariable String apellidoM, @PathVariable String area) {
        String newTrabajador = "Número Trabajador: " + numTrabajador + "\n  " + "Nombre: " + nombre + "\n " + "Apellido Paterno: " + apellidoP + "\n   " + "Apellido Materno: " + apellidoM + "\n " + "Área: " + area + "\n    ";
        return newTrabajador;
    }

    @GetMapping("/alumno/{matricula}/{nombre}/{apellidoP}/{apellidoM}/{carrera}")
    public String getAlumno(@PathVariable Integer matricula, @PathVariable String nombre, @PathVariable String apellidoP, @PathVariable String apellidoM, @PathVariable String carrera) {
        String newAlumno = "Matricula: " + matricula + "\n  " + "Nombre: " + nombre + "\n " + "Apellido Paterno: " + apellidoP + "\n   " + "Apellido Materno: " + apellidoM + "\n " + "Carrera: " + carrera + "\n    ";
        return newAlumno;
    }
    

}
