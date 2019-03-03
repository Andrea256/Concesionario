/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author AndreaOrjuela
 */


public class inventario {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //int cantidadmin = 0;
    
    public List<carroDeportivo> listaCarroDep = new ArrayList<>();
    public List<carroEstandar> listaCarroEst = new ArrayList<>();
    public List<carroMaquinaria> listaCarroMaqui = new ArrayList<>();
    public List<carroPersonal> listaCarroPersonal = new ArrayList<>();
    public List<vendedor> listaVendedor = new ArrayList<>();
    /**
     * 
     * Metodo que agrega carro deportivo.
     */
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
        
    }    
    /**
     * Metodo que muestra carro deportivo.
     */      
    public void verCarroDep(){    
        quemarCarros();
        for (int i = 0; i < listaCarroDep.size(); i++) {

            System.out.println("Marca: "+ listaCarroDep.get(i).getMarca());
            System.out.println("Referencia: "+ listaCarroDep.get(i).getReferencia());
            System.out.println("Color: "+ listaCarroDep.get(i).getColor());
            System.out.println("Precio "+ listaCarroDep.get(i).getPrecio());
            System.out.println("Velocidad: "+ listaCarroDep.get(i).getVelocidad());
        }
    }
    /**
     * 
     * Metodo que modifica carro deportivo.
     */
    public void modifCarroDeportivo()throws IOException{
        
        quemarCarros();
        
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));

        String refModif;       
        String marca;
        String referencia;
        String color;
        int precio;
        String velocidad;
        
        System.out.println("Referencia del carro a modificar: ");
        refModif = br.readLine();
        
        for (int i = 0; i < listaCarroDep.size(); i++){
            
            if(listaCarroDep.get(i).getReferencia().equals(refModif)){
                
                System.out.println("Marca: "+ listaCarroDep.get(i).getMarca());
                System.out.println("Modificar por: ");
                marca = brm.readLine();
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroDep.get(i).getColor());
                System.out.println("Modificar por: ");
                color = brm.readLine();
                System.out.println("Precio: "+ listaCarroDep.get(i).getPrecio());
                System.out.println("Modificar por: ");
                precio = Integer.parseInt(brm.readLine());
                System.out.println("Velocidad: "+ listaCarroDep.get(i).getVelocidad());
                System.out.println("Modificar por: ");
                velocidad = brm.readLine();
                
                carroDeportivo cD = new carroDeportivo(marca, refModif, color, precio, velocidad);
                
                //cD.replaceAll(listaCarroDep);

                }
        }
        
        /*for(carroDeportivo cD:listaCarroDep){
            
                if(cD.getReferencia().equals(refModif)){
                System.out.println("Marca: "+ listaCarroDep.get(0).getMarca());
                
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroDep.get(0).getColor());
                System.out.println("Precio: "+ listaCarroDep.get(0).getPrecio());
                System.out.println("Velocidad: "+ listaCarroDep.get(0).getVelocidad());

                }
                
                }*/
        if((listaCarroDep.get(0).getReferencia()) == null){
                    
                    System.out.println("No existe el carro");
            
                
            }
            
        }
    /**
     * 
     * Metodo que elimina carro deportivo.
     */    
    public void eliminarCarroDeportivo () throws IOException{
        //quemarCarros();
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));
        String refElim;
        //int size =listaCarroDep.size();
        
        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();
        
        for (int el = 0; el < listaCarroDep.size(); el ++){
            if(listaCarroDep.get(el).getReferencia().equals(refElim)){
                listaCarroDep.remove(el);
                
                System.out.println("Referencia "+refElim.toUpperCase()+" eliminado");
            }
        }
        
    }
    /**
     * 
     * Metodo que agrega carro estandar.
     */
    public void agregarCarroEstandar () throws IOException{
        
        String marca;
        String referencia;
        String color;
        int precio;
        
        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia= br.readLine();
        System.out.print("Color : ");
        color=br.readLine();
        System.out.print("Precio : ");
        precio=Integer.parseInt(br.readLine());
        
        carroEstandar carEst= new carroEstandar(marca, referencia, color, precio);
        
        listaCarroEst.add(carEst);
        
    }
    /**
     * Metodo que muestra carro estandar.
     */  
    public void verCarroEst(){
        quemarCarros();
        
        for (int carEst = 0; carEst < listaCarroEst.size(); carEst++){
            
            System.out.println("Marca: "+ listaCarroEst.get(carEst).getMarca());
            System.out.println("Referencia: "+ listaCarroEst.get(carEst).getReferencia());
            System.out.println("Color: "+ listaCarroEst.get(carEst).getColor());
            System.out.println("Precio "+ listaCarroEst.get(carEst).getPrecio());
        
        }
    }
    /**
     * Metodo que modifica carro estandar.
     */
    public void modifCarroEstandar() throws IOException{
        
    }
    /**
     * Metodo que elimina carro estandar.
     */
    public void eliminarCarroEstandar () throws IOException{
        
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));
        String refElim;
        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();
        
        for (int el = 0; el < listaCarroEst.size(); el ++){
            if(listaCarroEst.get(el).getReferencia().equals(refElim)){
                listaCarroEst.remove(el);
                
                System.out.println("Referencia "+refElim.toUpperCase()+" eliminado");
            }
        }
        
    }
    
    
    
    public void quemarCarros() {
        
        carroDeportivo carDep1 = new carroDeportivo("chevrolet", "sail", "negro", 1200, "18 km \n");
        carroDeportivo carDep2 = new carroDeportivo("kia", "rio", "rojo", 1300, "20 km \n");
        listaCarroDep.add(carDep1);
        listaCarroDep.add(carDep2);
        carroEstandar carEst1 = new carroEstandar("renault", "sandero", "verde", 1400);
        carroEstandar carEst2 = new carroEstandar("chevrolet", "gt", "amarillo", 1000);
        listaCarroEst.add(carEst1);
        listaCarroEst.add(carEst2);
        carroMaquinaria maq1 = new carroMaquinaria("cargador", "cat", "metrico", "amarillo", 3200);
        carroMaquinaria maq2 = new carroMaquinaria("excavadora", "volvo", "power", "negro", 3400);
        listaCarroMaqui.add(maq1);
        listaCarroMaqui.add(maq2);
        carroPersonal carPer1 = new carroPersonal("audi", "r8", "azul", "plateados", "negra", 2300);
        carroPersonal carPer2 = new carroPersonal("land rover", "sport", "tabaco", "plateados", "cafe", 2500);
        listaCarroPersonal.add(carPer1);
        listaCarroPersonal.add(carPer2);
    }
    
    public void quemarVendedor (){
        
        vendedor vend1 = new vendedor("Pedro", "123456", 320156 , "concesionario 2", 0);
        vendedor vend2 = new vendedor("Jose", "78999", 310231, "concesionario 3", 0);
        listaVendedor.add(vend1);
        listaVendedor.add(vend2);
    }
}
