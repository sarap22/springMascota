package com.Mascota.demo.Controladores;
import com.Mascota.demo.Entidades.Mascota;
import com.Mascota.demo.Servicios.mostrarMascota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controladorMascota {
    mostrarMascota mascota= new mostrarMascota();
    @GetMapping ("/verMascota")
    public ArrayList<Mascota> verMascota() {
        return mascota.mostrarLista();
    }
    @GetMapping("/cantidadMascota")
    public int cantMascotas(){
        return mascota.cantidadMascotas();
    }
    @GetMapping("/cantidadTipo")
    public int canTipo(){
        return mascota.cantTipo();
    }
}
