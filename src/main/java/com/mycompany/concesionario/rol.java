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


public abstract class rol {
    
    private String nombre;
    private String apellido;
    private int cedula;

    /**
     * 
     * @param nombre contiene el nombre.
     * @param apellido cotiene el apellido.
     * @param cedula contiene la cedula.
     */
    
    public rol(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    
}


