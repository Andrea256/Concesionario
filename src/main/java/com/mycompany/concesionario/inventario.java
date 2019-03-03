/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AndreaOrjuela
 */


public class inventario {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public List<carroDeportivo> listaCarroDep = new ArrayList<>();
    
    public void agregarCarroDeportivo()throws IOException{
        
        String marca;
        String referencia;
        String color;
        int precio;
        String velocidad;
        
        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia= br.readLine();
        System.out.print("Color : ");
        color=br.readLine();
        System.out.print("Precio : ");
        precio=Integer.parseInt(br.readLine());
        System.out.print("Velocidad : ");
        velocidad=br.readLine();
 
        carroDeportivo carDep = new carroDeportivo(marca, referencia, color, precio, velocidad);
        
        listaCarroDep.add(carDep);
        System.out.println("");
        
    }


    
          
    public void verCarroDep(){    
        for(carroDeportivo cD: listaCarroDep) {
            //System.out.println(cD);
            System.out.println("Marca: "+ cD.getMarca());
            System.out.println("Referencia: "+ cD.getReferencia());
            System.out.println("Color: "+ cD.getColor());
            System.out.println("Precio "+ cD.getPrecio());
            System.out.println("Velocidad: "+ cD.getVelocidad());
        }
    }
   
}
