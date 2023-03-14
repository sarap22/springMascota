package com.Mascota.demo.Servicios;

import com.Mascota.demo.Entidades.paseador;

import java.util.ArrayList;

public class verPaseador {

    private ArrayList<paseador> lista=new ArrayList<>();

    public verPaseador(){

        lista.add(new paseador("Martin","Oviedo",10002374,23,312457389,15000));
        lista.add(new paseador("Laura","Pinedo",183765476,25,315478593,20000));
        lista.add(new paseador("Sofia","Olivares",277645673,23,311476789,13000));
        lista.add(new paseador("Pedro","Montez",183478594,32,312896453,18000));
        lista.add(new paseador("Moisés","Gutierrez",18305634,34,321356271,17000));
        lista.add(new paseador("Kevin","Rodriguez",182557474,20,321457076,20000));
        lista.add(new paseador("Sara","Prieto",30057436,18,311303303,16000));
        lista.add(new paseador("Jostin","Tragao",18456372,18,312202124,25000));
        lista.add(new paseador("Vanessa","Gordillo",104736483,18,34577988,19000));
        lista.add(new paseador("Diego","Ilusiones",18376958,18,324758690,14000));
        lista.add(new paseador("Karen","Linares",10376544,27,321986503,17000));
        lista.add(new paseador("Evangelin","Bejarano",1021394157,37,313567839,20000));


    }

    public int cantPaseadores(){
        return lista.size();
    }

    public ArrayList<paseador> Mostrartodos(){
        return lista;
    }

    public int cantEdad(){
        int edad=18;
        int sumar=0;
        for(paseador i:lista){
            System.out.println(i.getEdad());
            if(i.getEdad()==edad){
                sumar+=1;
            }
        }

        return sumar;

    }

    
}
