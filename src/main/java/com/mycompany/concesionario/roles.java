/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

/**
 * Clase padre de cliente y vendedor.
 * @author AndreaOrjuela
 */
public class roles {
    
    protected String nombre;
    protected String cedula;
    protected int celular;
    protected String direccion;
    
    /**
     * Constructor de roles.
     * @param nombre variable que contiene el nombre.
     * @param cedula variable que contiene la cedula
     * @param celular variable que contiene el celular
     * @param direccion variable que contiene la direccion
     */

    public roles(String nombre, String cedula, int celular, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
    }

    /**
     * 
     * Getter y Setter.
     */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
