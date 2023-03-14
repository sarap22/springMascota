package com.Mascota.demo.Servicios;
import com.Mascota.demo.Entidades.dueño;
import java.util.ArrayList;

public class metDueño {
    private ArrayList<dueño> listadueños = new ArrayList<>();

    public metDueño(){
        listadueños.add(new dueño("Andres03",1,"Bogotá","3056874321"));
        listadueños.add(new dueño("Sofia_valentina",2,"Facatativa","3209786542"));
        listadueños.add(new dueño("Eduard",3,"Bogotá","3008796090"));
        listadueños.add(new dueño("Sebas01",4,"Funza","3007652980"));
        listadueños.add(new dueño("Pabloxde",5,"Mosquera","315752899"));
    }

    public int cantidadDueños(){
        return listadueños.size();
    }

    public ArrayList<dueño> mostrarTodosDueños() {
        return listadueños;
    }

    public ArrayList<dueño> buscarPorCuidad(String cuidad){
        ArrayList<dueño> listaPorCiudad = new ArrayList<>();
        for (dueño i:listadueños){
            if (i.getSitio() == cuidad){
                listaPorCiudad.add(i);
            }
        }
        return listaPorCiudad;
    }
}
