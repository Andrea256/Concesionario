/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;

/**
 *
 * @author AndreaOrjuela
 */
public class carroPersonal extends carros {
    
    private String rines;
    private String cojineria;

    public carroPersonal(String rines, String cojineria, String marca, String referencia, String color, int precio) {
        super(marca, referencia, color, precio);
        this.rines = rines;
        this.cojineria = cojineria;
    }

    

    

    public String getRines() {
        return rines;
    }

    public void setRines(String rines) {
        this.rines = rines;
    }

    public String getCojineria() {
        return cojineria;
    }

    public void setCojineria(String cojineria) {
        this.cojineria = cojineria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
