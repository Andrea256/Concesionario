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
     * @param marca 
     * @param referencia
     * @param color
     * @param rines
     * @param cojineria
     * @param precio 
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
