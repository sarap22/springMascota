package com.Mascota.demo.Servicios;

import com.Mascota.demo.Entidades.Mascota;

import java.util.ArrayList;

public class mostrarMascota {
    private ArrayList<Mascota> lista= new ArrayList<>();
    public mostrarMascota() {
        lista.add(new Mascota("Nube",1,"Perro","Dalmata",5, 3));
        lista.add(new Mascota("Coky",2,"Gato","Criollo",16,1));
        lista.add(new Mascota("Jackie",3,"Perro","Puddle",1,7));
        lista.add(new Mascota("Dulce",4,"Perro","Balinés",15,5));
        lista.add(new Mascota("Teddy",5,"Gato","Chinchilla",3,11));
    }
    public int cantidadMascotas(){
        return lista.size();
    }

    public ArrayList<Mascota> mostrarLista() {
        return lista;
    }

    public int cantTipo() {
        String tipo ="Gato";
        int cuenta=0;
        for (Mascota i :lista){
            System.out.println(i.getTipo());
            if(i.getTipo()==tipo) {
                cuenta +=1;
            }
        }
        return cuenta;
    }
}
