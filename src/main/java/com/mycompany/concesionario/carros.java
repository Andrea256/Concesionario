/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author AndreaOrjuela
 * 
 * Clase padre de la clasificacion de los carros.
 */
public class carros {
    
    protected String marca;
    protected String referencia;
    protected String color;
    protected int precio;
    
    /**
     * 
     * @param marca variable que contiene la marca de los carros.
     * @param referencia variable que contiene la referencia de los carros.
     * @param color variable que contiene el color de los carros.
     * @param precio variable que contiene el precio de los carros.
     */
    public carros(String marca, String referencia, String color, int precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.precio = precio;
    }

    /**
     * 
     * Setter y Getter
     */
    
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
    
