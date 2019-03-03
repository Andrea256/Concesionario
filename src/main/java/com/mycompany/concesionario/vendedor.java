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

    public vendedor(String nombre, String cedula, int celular, String direccion, int comision) {
        super(nombre, cedula, celular, direccion);
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    
    
    
}
