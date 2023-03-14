package com.Mascota.demo.Entidades;

public class dueño {
    private String usuario;
    private int codigoMascota;
    private String sitio;
    private String telefono;

    public dueño() {
    }

    public dueño(String usuario, int codigoMascota, String sitio, String telefono) {
        this.usuario = usuario;
        this.codigoMascota = codigoMascota;
        this.sitio = sitio;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(int codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
