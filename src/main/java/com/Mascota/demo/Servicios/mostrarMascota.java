package com.Mascota.demo.Servicios;

import com.Mascota.demo.Entidades.Mascota;

import java.util.ArrayList;

public class mostrarMascota {
    private ArrayList<Mascota> lista= new ArrayList<>();

    public mostrarMascota() {
        lista.add(new Mascota("Nube",1,"Dalmata",5, 3));
        lista.add(new Mascota("Coky",2,"Criollo",16,1));
        lista.add(new Mascota("Jackie",3,"Puddle",1,7));
        lista.add(new Mascota("Dulce",4,"Balinés",15,5));
        lista.add(new Mascota("Teddy",5,"Chinchilla.0",3,11));
    }
    public int cantidadMascotas(){
        return lista.size();
    }

    public ArrayList<Mascota> getLista() {
        return lista;
    }
}
