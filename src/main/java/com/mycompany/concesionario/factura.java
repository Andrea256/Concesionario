/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AndreaOrjuela
 */
public class factura {
    public List<venta> listaVenta = new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     * Constructor de agregar venta
     * @param ven reune todos los parametros de la venta
     */
    public void agregarVenta(venta ven){
        listaVenta.add(ven);
        
        
    }
    /**
     * For que recorre las ventas
     */
    public void verVenta(){
        for (int i = 0; i < listaVenta.size(); i++) {

            System.out.println("Marca: " + listaVenta.get(i).getMarca());
            System.out.println("Referencia: " + listaVenta.get(i).getReferencia());
            System.out.println("Color: " + listaVenta.get(i).getColor());
            System.out.println("Precio " + listaVenta.get(i).getPrecio());
            System.out.println("Velocidad: " + listaVenta.get(i).getVelocidad());
            System.out.println("Cedula: " + listaVenta.get(i).getCedula());
        }
    }
}
