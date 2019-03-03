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
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //String fecha;
    
    public List<vendedor> listaVendedor = new ArrayList<>();
    public List<carroDeportivo> listaCarroDep;
    public List<carroEstandar> listaCarroEst;
    public List<carroMaquinaria> listaCarroMaqui;
    public List<carroPersonal> listaCarroPersonal;
    
    inventario inv = new inventario();
    venta v = new venta(0);    
    
    public void venderDep() throws IOException{
        inv.quemarCarros();
        String refVenD;
        String marca;
        String referencia;
        String color;
        int precio;
        String velocidad;
        
        System.out.println("Dijite la referencia del deportivo a vender: ");
        refVenD = br.readLine();
        
        for(int i = 0; i < listaCarroDep.size(); i++){
            
            if(listaCarroDep.get(i).getReferencia().equals(refVenD)){
                
                System.out.println("Marca: "+ listaCarroDep.get(i).getMarca());
                System.out.println("Referencia: " + refVenD);
                System.out.println("Color: " + listaCarroDep.get(i).getColor());
                System.out.println("Precio: "+ listaCarroDep.get(i).getPrecio());
                System.out.println("Velocidad: "+ listaCarroDep.get(i).getVelocidad());
                
                asigVendedor();
            }
        }
    }
    
    
    /**
     * Constructor que asigna vendedor a la compra.
     * 
     */
    public void asigVendedor() throws IOException{
        
        inv.quemarVendedor();
        int cedula;
        
        System.out.println("Cedula del vendedor: ");
        cedula = Integer.parseInt(br.readLine());
        
        for (int cedV = 0; cedV < listaVendedor.size(); cedV++) {
            if(listaVendedor.get(cedV).getCedula().equals(cedV)){
                
                System.out.println("Nombre: "+ listaVendedor.get(cedV).getNombre());
                System.out.println("Cédula: " + cedV);
        
            }
        }
    }
}

