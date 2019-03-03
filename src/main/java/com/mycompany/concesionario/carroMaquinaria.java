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
public class carroMaquinaria extends carros {
    
    private String tipo;
    
    public void agregarCarro(){
         
    }

    public carroMaquinaria(String tipo, String marca, String referencia, String color, int precio) {
        super(marca, referencia, color, precio);
        this.tipo = tipo;
    }
    
    /**
     * 
     * Getter y Setter 
     */

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
