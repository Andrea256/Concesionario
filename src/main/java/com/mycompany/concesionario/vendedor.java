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
public class vendedor extends roles{
    
    private int comision;
    /**
     * Contrictor de vendedor
     * @param nombre variable que contiene el nombre del vendedor
     * @param cedula variable que contiene la cedula del vendedor
     * @param celular variable que contiene el numero celular del vendedor
     * @param direccion variable que contiene la direccion del vendedor
     * @param comision variable que contiene la comision del vendedor
     */
    public vendedor(String nombre, String cedula, int celular, String direccion, int comision) {
        super(nombre, cedula, celular, direccion);
        this.comision = comision;
    }
    
    /**
     * 
     * Getter y Setters
     */
    
    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    
    
    
}
