package com.Mascota.demo.Controladores;


import com.Mascota.demo.Entidades.paseador;
import com.Mascota.demo.Servicios.verPaseador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class contoladorPaseador {

    verPaseador paseador=new verPaseador();

    @GetMapping ("/verpaseadores")
    public ArrayList<paseador> verpaseador(){
        return paseador.Mostrartodos();
    }

    @GetMapping ("/cantidadP")
    public int cantiPaseador(){
        return paseador.cantPaseadores();
    }

    @GetMapping ("/cantporEdad")
    public int cantEdad(){
        return paseador.cantEdad();
    }
}
