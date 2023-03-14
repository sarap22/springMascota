package com.Mascota.demo.Entidades;

public class Mascota {
    private String nombre;
    private int codigo;
    private String tipo;
    private String raza;
    private int peso;
    private int edad;

    public Mascota() {

    }

    public Mascota(String nombre, int codigo, String tipo, String raza, int peso, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
