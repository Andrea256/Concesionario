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
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author AndreaOrjuela
 */
public class menuPrincipal {

    Scanner entrada = new Scanner(System.in);
    inventario inv = new inventario();
    factura fact = new factura();
    
    /**
     * 
     * Menu principal.
     */
    public void menu() throws IOException {     

        while (true) {
            
            System.out.println("---- MENU ----");
            System.out.println("Elija una opción");
            System.out.println("1. Inventario");
            System.out.println("2. Venta");
            System.out.println("5. Salir");

            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    inventario();
                    break;
                case 2:
                    ventaCarros();
                    break;

            }
        }
    }

    /**
     * 
     * Sub menu para agregar, ver, modificar y eliminar carros.
     */
    private void inventario() throws IOException {
            
        System.out.println("--- Inventario ---");
        System.out.println("1.Agregar carros");
        System.out.println("2.Ver carros");
        System.out.println("3.Modificar carros");
        System.out.println("4.Eliminar carros \n");

        int opcion1 = entrada.nextInt();
        //inventario inv = new inventario();
        switch (opcion1) {

            case 1:
                System.out.println("--- Elija el carro a agregar ---");
                System.out.println("1. Deportivo");
                System.out.println("2. Estandar");
                System.out.println("3. Maquinaria");
                System.out.println("4. Personalizado \n");

                int opcion2 = entrada.nextInt();

                switch (opcion2) {

                    case 1:
                        inv.agregarCarroDeportivo();
                        break;
                    case 2:
                        inv.agregarCarroEstandar();
                        break;
                    case 3:
                        inv.agregarMaquinaria();
                        break;
                    case 4:
                        inv.agregarCarroDeportivo();
                        break;
                    default:
                        System.out.println("Opcion invalida");
                    }

                break;

            case 2:
                System.out.println("Ver carros");
                inv.verCarroDep(); System.out.println("\n");
                inv.verCarroEst(); System.out.println("\n");
                inv.verCarroMaq(); System.out.println("\n");
                inv.verCarroPer(); System.out.println("\n");               
                break;
            case 3:
                
                System.out.println("\n");
                inventarioModificar();

                break;
            case 4:
                System.out.println("Eliminar carros \n");
                inventarioEliminar();
                break;

            default:
                System.out.println("Opcion invalida");
                break;

        }

    }
    /**
     * 
     * Menu para modificar carros. 
     */
    private void inventarioModificar() throws IOException {

        System.out.println("---- Modificar Carro ---");
        System.out.println("Elija el tipo de carro a modificar: "+"\n");
        
        System.out.println("1.Deportivo: ");
        System.out.println("2.Estandar: ");
        System.out.println("3.Maquinaria: ");
        System.out.println("4.Persolanizado: ");
        
        int opcModif = entrada.nextInt();
        switch (opcModif){
            
            case 1:
                System.out.println("--- Deportivo ---");
                inv.modifCarroDeportivo();
                break;
            case 2:
                System.out.println("--- Estandar ---");
                inv.modifCarroEstandar();
                break;
            case 3:
                System.out.println("--- Maquinaria ---");
                inv.modifMaq();
                break;
            case 4:
                System.out.println("--- Personalizado ---");
                inv.modifCarroPer();
                break;
        }
        
    }
    /**
     * 
     * Menu para eliminar carros.
     */
    private void inventarioEliminar () throws IOException{
        
        System.out.println("---- Eliminar Carro ---");
        System.out.println("Elija el tipo de carro a eliminar: "+"\n");
        System.out.println("1.Deportivo: ");
        System.out.println("2.Estandar: ");
        System.out.println("3.Maquinaria: ");
        System.out.println("4.Persolanizado: ");
        
        int opcElim = entrada.nextInt();
        switch (opcElim){
            
            case 1:
                System.out.println("--- Deportivo ---");
                inv.eliminarCarroDeportivo();
                break;
            case 2:
                System.out.println("--- Estandar ---");
                inv.eliminarCarroEstandar();
                break;
            case 3:
                System.out.println("--- Maquinaria ---");
                inv.eliminarMaq();
                break;
            case 4:
                System.out.println("--- Personalizado ---");
                inv.eliminarCarroPer();
                break;
        }
    }
    /**
     * 
     * Metodo que agrega venta. 
     */       
    private void ventaCarros () throws IOException{
        
        System.out.println("--- Venta ---");
        System.out.println("1.Agregar venta");
        System.out.println("2.Ver ventas");

        int opVen = entrada.nextInt();
        
        switch (opVen){
            
            case 1 :
                
                System.out.println("--- Elija el tipo coche a vender ---");
                System.out.println("1. Deportivo");
                System.out.println("2. Estandar");
                System.out.println("3. Maquinaria");
                System.out.println("4. Personalizado \n");
                
                int opVen2 = entrada.nextInt();
                
                switch (opVen2){
                    
                    case 1:
                        System.out.println("--- Deportivo ---");
                        venderDep();
                        break;
                    case 2:
                        System.out.println("--- Estandar ---");
                        venderEst();
                        break;
                    case 3:
                        System.out.println("--- Maquinaria ---");
                        venderMaqu();
                        break;
                    case 4:
                        System.out.println("--- Personalizado ---");
                        venderPer();
                        break;
                }
                break;
            case 2:
                fact.verVenta();
                break;
        }   
    }
    /**
     * Metodo para mostrar y vender carro deportivo.
     */
    public void venderDep() throws IOException{
        
        System.out.println("1. Mostrar carros deportivos");
        System.out.println("2. Vender carro deportivo");
        
        int venDep = entrada.nextInt();
        
        switch(venDep){
            
            case 1:
                System.out.println("--- Carros deportivos ---");
                inv.verCarroDep();
                break;
            case 2:
                System.out.println("--- Venta deportivos ---");
                //inv.asigVendedor();
                inv.venderDep();
                break;
            case 3:
                //inv.venderDep();
                break;
        }
    }
    /**
     * Metodo para mostrar y vender carro estandar.
     */
    public void venderEst(){
        System.out.println("1. Mostrar carro estandar");
        System.out.println("2. Vender carro estandar");
        
        int venEst = entrada.nextInt();
        
        switch(venEst){
            
            case 1:
                System.out.println("--- Carros estandar ---");
                inv.verCarroEst();
                break;
            case 2:
                break;
        }
    }
    /**
     * Metodo para mostrar y vender maquinaria.
     */
    public void venderMaqu(){
        System.out.println("1. Mostrar maquinaria");
        System.out.println("2. Vender maquinaria");
        
        int venMaq = entrada.nextInt();
        
        switch(venMaq){
            
            case 1:
                break;
            case 2:
                break;
        }
    }
    /**
     * Metodo para mostrar y vender carro personalizado.
     */
    public void venderPer(){
        System.out.println("1. Mostrar carros personalizados");
        System.out.println("2. Vender carro personalizado");
        
        int venPer = entrada.nextInt();
        
        switch(venPer){
            
            case 1:
                break;
            case 2:
                break;
        }
    }
    
}
