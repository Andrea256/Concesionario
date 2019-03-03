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
        //System.out.println("dfghjhgdsdfgh");
        for (int i = 0; i < listaCarroDep.size(); i++) {
            //System.out.println(cD);
            //System.out.println("dfghjhgdsdfgh12345678");
            System.out.println("Marca: "+ listaCarroDep.get(i).getMarca());
            System.out.println("Referencia: "+ listaCarroDep.get(i).getReferencia());
            System.out.println("Color: "+ listaCarroDep.get(i).getColor());
            System.out.println("Precio "+ listaCarroDep.get(i).getPrecio());
            System.out.println("Velocidad: "+ listaCarroDep.get(i).getVelocidad());
        }
    }
    public void quemarCarros() {
        carroDeportivo carDep = new carroDeportivo("asd", "qwe", "ewq", 123, "dsf");
        carroDeportivo carDep1 = new carroDeportivo("asd", "qwe", "ewq", 123, "dsf");
        carroDeportivo carDep2 = new carroDeportivo("asd", "qwe", "ewq", 123, "dsf");
        carroDeportivo carDep3 = new carroDeportivo("asd", "qwe", "ewq", 123, "dsf");
        listaCarroDep.add(carDep);
        listaCarroDep.add(carDep1);
        listaCarroDep.add(carDep2);
        listaCarroDep.add(carDep3);
        
    }
}
