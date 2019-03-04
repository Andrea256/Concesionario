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
public class cliente extends roles{
    
    /**
     * Constructor de cliente
     * @param nombre variable que contiene nombre del cliente
     * @param cedula variable que contiene la cedula del cliente
     * @param celular variable que contiene el celular del cliente
     * @param direccion variable que contiene la direccion del cliente
     */
    public cliente(String nombre, String cedula, int celular, String direccion) {
        super(nombre, cedula, celular, direccion);
    }
    
}
