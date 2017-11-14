/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

/**
 *
 * @author alumno
 */
public class TelefonoMovil {
    
    private String descripcion;
    private String pantalla;
    private String camara; 
    private String procesador;
    private String urlImage;

    public TelefonoMovil() {
    }

    public TelefonoMovil(String pantalla, String camara, String procesador, String urlImage) {
        this.pantalla = pantalla;
        this.camara = camara;
        this.procesador = procesador;
        this.urlImage = urlImage;
    } 
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
}
