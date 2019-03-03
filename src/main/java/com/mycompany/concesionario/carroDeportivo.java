/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndreaOrjuela
 */
public class carroDeportivo extends carros {

    protected String velocidad;   

    public carroDeportivo(String marca, String referencia, String color, int precio, String velocidad) {
        super(marca, referencia, color, precio);
        this.velocidad = velocidad;
    }
    
    
    /**
     * 
     * Getter y Setters 
     */

    
    
    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
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
