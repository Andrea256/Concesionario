/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 *
 * @author AndreaOrjuela
 */
public class carroEstandar extends carros {
    
    public void agregarCarro(){
        
    } 
    /**
     * Constructor de carro Estandar 
     * @param marca variable que contiene la marca de carro estandar
     * @param referencia variable que contiene la referencia de carro estandar
     * @param color variable que contiene el color de carro estandar
     * @param precio variable que contiene el precio de carro estandar
     */
    public carroEstandar(String marca, String referencia, String color, int precio) {
        super(marca, referencia, color, precio);
    }
     
    /**
     * 
     * Getter y Setter 
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
