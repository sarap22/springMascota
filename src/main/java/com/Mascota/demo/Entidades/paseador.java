package com.Mascota.demo.Entidades;

public class paseador {

    private String nombre;
    private String apellido;
    private int identificacion;
    private int edad;
    private int telefono;
    private int costoxHora;

    public paseador(String nombre, String apellido, int identificacion, int edad, int telefono, int costoxHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.edad = edad;
        this.telefono = telefono;
        this.costoxHora = costoxHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCostoxHora() {
        return costoxHora;
    }

    public void setCostoxHora(int costoxHora) {
        this.costoxHora = costoxHora;
    }
}
