package com.Mascota.demo.Controladores;

import com.Mascota.demo.Entidades.dueño;
import com.Mascota.demo.Servicios.metDueño;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controladorDueño {
    metDueño dueños = new metDueño();

    @GetMapping("/verDueños")
    public ArrayList<dueño> verDueños(){
        return dueños.mostrarTodosDueños();
    }

    @GetMapping("/cantidadDueños")
    public int cantDueños(){
        return dueños.cantidadDueños();
    }

    @GetMapping("/dueñosPorCuidad")
    public ArrayList<dueño> dueñosCiudad(){
        return dueños.buscarPorCuidad("Bogotá");
    }
}
