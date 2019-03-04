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

    /**
     * Constructor de carro personal.
     * @param marca variable que contiene la marca de carro personal.
     * @param referencia variable que contiene la referencia de carro personal.
     * @param color variable que contiene el color de carro personal.
     * @param rines variable que contiene los rines de carro personal.
     * @param cojineria variable que contiene la cojineria de carro personal.
     * @param precio variable que contiene el precio de carro personal.
     */
    public carroPersonal(String marca, String referencia, String color, String rines, String cojineria, int precio) {
        super(marca, referencia, color, precio);
        this.rines = rines;
        this.cojineria = cojineria;
    }
    
    /**
     * 
     * @Getter y Setter.
     */
    
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

        
    
}
