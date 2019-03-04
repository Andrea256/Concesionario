/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AndreaOrjuela
 */
public class venta {
    
    int cantidad;
    String marca;
    String referencia;
    String color;
    int precio;
    String velocidad;
    String tipo;
    String rines;
    String cojineria;
    String cedula;
    
    /**
     * Constructor de venta
     * Se traen todos los parametro que se van a contener en la venta
     */
    public venta(int cantidad, String marca, String referencia, String color, int precio, String velocidad, String tipo, String rines, String cojineria, String cedula) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.precio = precio;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.rines = rines;
        this.cojineria = cojineria;
        this.cedula = cedula;
    }
    /**
     * 
     * Constructor de la venta
     * Se toman las variables que se usaran para vender un carro deportivo
     */
    venta(int cantidad, String marca, String referencia, String color, int precio, String velocidad) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.precio = precio;
        this.velocidad = velocidad;
    }

    /**
     * 
     * Getters y Setters 
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
