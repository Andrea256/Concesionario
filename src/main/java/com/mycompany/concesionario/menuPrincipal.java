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

/**
 *
 * @author AndreaOrjuela
 */
public class menuPrincipal {

    Scanner entrada = new Scanner(System.in);
    inventario i = new inventario();
    public void menu() throws IOException {     
        //i.quemarCarros();
        //i.verCarroDep();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        while (true) {

            System.out.println("Elija una opción");
            System.out.println("1. Inventario");
            System.out.println("2. Venta");
            System.out.println("5. Salir");

            int opcion = entrada.nextInt();
            //inventario inv = new inventario();

            switch (opcion) {

                case 1:
                    inventario();
                case 2:

                    System.out.println("2. Ver carros \n");
                    //inv.verCarroDep();

                    break;
                case 3:
                    System.out.println("1. Eliminar carros");
                    break;

            }

        }
    }

    private void inventario() throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Agregar carros");
        System.out.println("2.Ver carros");
        System.out.println("3.");

        int opcion1 = entrada.nextInt();
        //inventario inv = new inventario();
        switch (opcion1) {

            case 1:
                System.out.println("--Elija el carro a agregar--");
                System.out.println("1. Deportivo");
                System.out.println("2. Estandar");
                System.out.println("3. Maquinaria");
                System.out.println("4. Personalizado");

                int opcion2 = entrada.nextInt();

                switch (opcion2) {

                    case 1:
                        i.agregarCarroDeportivo();
                        break;

                    case 2:

                        break;

                    default:
                        System.out.println("Opcion invalida");
                }

                break;

            case 2:
                System.out.println("Opcion 2");
                i.verCarroDep();

                break;
            case 3:

                break;

            default:
                System.out.println("Opcion invalida");
                break;

        }

    }

}
