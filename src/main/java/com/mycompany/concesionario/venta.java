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
    
    /**
     * Constructor de la cantidad
     * @param cantidad parametro de cantidad.
     */
    
    public venta(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * 
     * Getter y Setter. 
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
