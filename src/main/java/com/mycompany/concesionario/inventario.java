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
    int cantidadmin = 0;
    /**
     * Listas
     */
    public List<carroDeportivo> listaCarroDep = new ArrayList<>();
    public List<carroEstandar> listaCarroEst = new ArrayList<>();
    public List<carroMaquinaria> listaCarroMaqui = new ArrayList<>();
    public List<carroPersonal> listaCarroPersonal = new ArrayList<>();
    public List<vendedor> listaVendedor = new ArrayList<>();
    venta v;
    /**
     *
     * Metodo que agrega carro deportivo.
     */
    public void agregarCarroDeportivo() throws IOException {

        String marca;
        String referencia;
        String color;
        int precio;
        String velocidad;

        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia = br.readLine();
        System.out.print("Color : ");
        color = br.readLine();
        System.out.print("Precio : ");
        precio = Integer.parseInt(br.readLine());
        System.out.print("Velocidad : ");
        velocidad = br.readLine();

        carroDeportivo carDep = new carroDeportivo(marca, referencia, color, precio, velocidad);

        listaCarroDep.add(carDep);

    }

    /**
     * Metodo que muestra carro deportivo.
     */
    public void verCarroDep() {
        quemarCarros();
        for (int i = 0; i < listaCarroDep.size(); i++) {

            System.out.println("Marca: " + listaCarroDep.get(i).getMarca());
            System.out.println("Referencia: " + listaCarroDep.get(i).getReferencia());
            System.out.println("Color: " + listaCarroDep.get(i).getColor());
            System.out.println("Precio " + listaCarroDep.get(i).getPrecio());
            System.out.println("Velocidad: " + listaCarroDep.get(i).getVelocidad());
        }
    }

    /**
     *
     * Metodo que modifica carro deportivo.
     */
    public void modifCarroDeportivo() throws IOException {

        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));

        String refModif;
        String marca;
        String color;
        int precio;
        String velocidad;

        System.out.println("Referencia del carro a modificar: ");
        refModif = br.readLine();

        for (int i = 0; i < listaCarroDep.size(); i++) {

            if (listaCarroDep.get(i).getReferencia().equals(refModif)) {

                System.out.println("Marca: " + listaCarroDep.get(i).getMarca());
                System.out.println("Modificar por: ");
                marca = brm.readLine();
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroDep.get(i).getColor());
                System.out.println("Modificar por: ");
                color = brm.readLine();
                System.out.println("Precio: " + listaCarroDep.get(i).getPrecio());
                System.out.println("Modificar por: ");
                precio = Integer.parseInt(brm.readLine());
                System.out.println("Velocidad: " + listaCarroDep.get(i).getVelocidad());
                System.out.println("Modificar por: ");
                velocidad = brm.readLine();

                listaCarroDep.get(i).setMarca(marca);
                listaCarroDep.get(i).setColor(color);
                listaCarroDep.get(i).setPrecio(precio);
                listaCarroDep.get(i).setVelocidad(velocidad);
            }
        }

    }

    /**
     *
     * Metodo que elimina carro deportivo.
     */
    public void eliminarCarroDeportivo() throws IOException {
        //quemarCarros();
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));
        String refElim;
        //int size =listaCarroDep.size();

        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();

        for (int el = 0; el < listaCarroDep.size(); el++) {
            if (listaCarroDep.get(el).getReferencia().equals(refElim)) {
                listaCarroDep.remove(el);

                System.out.println("Referencia " + refElim.toUpperCase() + " eliminado");
            }
        }

    }

    /**
     *
     * Metodo que agrega carro estandar.
     */
    public void agregarCarroEstandar() throws IOException {

        String marca;
        String referencia;
        String color;
        int precio;

        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia = br.readLine();
        System.out.print("Color : ");
        color = br.readLine();
        System.out.print("Precio : ");
        precio = Integer.parseInt(br.readLine());

        carroEstandar carEst = new carroEstandar(marca, referencia, color, precio);

        listaCarroEst.add(carEst);

    }

    /**
     * Metodo que muestra carro estandar.
     */
    public void verCarroEst() {
        
        quemarCarros();
        for (int carEst = 0; carEst < listaCarroEst.size(); carEst++) {

            System.out.println("Marca: " + listaCarroEst.get(carEst).getMarca());
            System.out.println("Referencia: " + listaCarroEst.get(carEst).getReferencia());
            System.out.println("Color: " + listaCarroEst.get(carEst).getColor());
            System.out.println("Precio " + listaCarroEst.get(carEst).getPrecio());

        }
    }

    /**
     * Metodo que modifica carro estandar.
     */
    public void modifCarroEstandar() throws IOException {
        
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));

        String refModif;
        String marca;
        String color;
        int precio;

        System.out.println("Referencia del carro a modificar: ");
        refModif = br.readLine();

        for (int i = 0; i < listaCarroEst.size(); i++) {

            if (listaCarroEst.get(i).getReferencia().equals(refModif)) {

                System.out.println("Marca: " + listaCarroEst.get(i).getMarca());
                System.out.println("Modificar por: ");
                marca = brm.readLine();
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroEst.get(i).getColor());
                System.out.println("Modificar por: ");
                color = brm.readLine();
                System.out.println("Precio: " + listaCarroEst.get(i).getPrecio());
                System.out.println("Modificar por: ");
                precio = Integer.parseInt(brm.readLine());

                listaCarroEst.get(i).setMarca(marca);
                listaCarroEst.get(i).setColor(color);
                listaCarroEst.get(i).setPrecio(precio);
            }
        }
    }

    /**
     * Metodo que elimina carro estandar.
     */
    public void eliminarCarroEstandar() throws IOException {

        String refElim;
        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();

        for (int el = 0; el < listaCarroEst.size(); el++) {
            if (listaCarroEst.get(el).getReferencia().equals(refElim)) {
                listaCarroEst.remove(el);

                System.out.println("Referencia " + refElim.toUpperCase() + " eliminado");
            }
        }

    }
    /**
     * Metodo que agrega maquinaria.
     *
     */
    public void agregarMaquinaria() throws IOException{
    
        String tipo;
        String marca;
        String referencia;
        String color;
        int precio;
        
        System.out.print("Tipo : ");
        tipo = br.readLine();
        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia = br.readLine();
        System.out.print("Color : ");
        color = br.readLine();
        System.out.print("Precio : ");
        precio = Integer.parseInt(br.readLine());
        

        carroMaquinaria carMaq = new carroMaquinaria(tipo ,marca, referencia, color, precio);

        listaCarroMaqui.add(carMaq);
    
    }
    /**
     * Metodo que muestra maquinaria.
     */
    public void verCarroMaq() {
        quemarCarros();
        for (int carM = 0; carM < listaCarroMaqui.size(); carM++) {
            
            System.out.println("Tipo: " + listaCarroMaqui.get(carM).getTipo());
            System.out.println("Marca: " + listaCarroMaqui.get(carM).getMarca());
            System.out.println("Referencia: " + listaCarroMaqui.get(carM).getReferencia());
            System.out.println("Color: " + listaCarroMaqui.get(carM).getColor());
            System.out.println("Precio " + listaCarroMaqui.get(carM).getPrecio());

        }
    }
    /**
     * 
     * Metodo que modifica maquinaria.
     */
    public void modifMaq() throws IOException {

        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));

        String refModif;
        String tipo;
        String marca;
        String color;
        int precio;

        System.out.println("Referencia de la maquina a modificar: ");
        refModif = br.readLine();

        for (int i = 0; i < listaCarroMaqui.size(); i++) {

            if (listaCarroMaqui.get(i).getReferencia().equals(refModif)) {
                
                System.out.print("Tipo : " + listaCarroMaqui.get(i).getTipo());
                System.out.println("Modificar por: ");
                tipo = br.readLine();
                System.out.println("Marca: " + listaCarroMaqui.get(i).getMarca());
                System.out.println("Modificar por: ");
                marca = brm.readLine();
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroMaqui.get(i).getColor());
                System.out.println("Modificar por: ");
                color = brm.readLine();
                System.out.println("Precio: " + listaCarroMaqui.get(i).getPrecio());
                System.out.println("Modificar por: ");
                precio = Integer.parseInt(brm.readLine());
                
                listaCarroMaqui.get(i).setTipo(tipo);
                listaCarroMaqui.get(i).setMarca(marca);
                listaCarroMaqui.get(i).setColor(color);
                listaCarroMaqui.get(i).setPrecio(precio);
            }
        }
    }
    /**
     * 
     * Metodo que elimina maquinaria.
     */
    public void eliminarMaq() throws IOException {

        String refElim;
        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();

        for (int el = 0; el < listaCarroMaqui.size(); el++) {
            if (listaCarroMaqui.get(el).getReferencia().equals(refElim)) {
                listaCarroMaqui.remove(el);

                System.out.println("Referencia " + refElim.toUpperCase() + " eliminado");
            }
        }

    }
    /**
     * 
     * Metodo que agrega carro personal.
     */
    public void agregarCarroPersonal() throws IOException {

        String marca;
        String referencia;
        String color;
        String rines;
        String cojineria;
        int precio;

        System.out.print("Marca : ");
        marca = br.readLine();
        System.out.print("Referencia : ");
        referencia = br.readLine();
        System.out.print("Color : ");
        color = br.readLine();
        System.out.print("Rines : ");
        rines = br.readLine();
        System.out.print("Cojineria : ");
        cojineria = br.readLine();
        System.out.print("Precio : ");
        precio = Integer.parseInt(br.readLine());

        carroPersonal carPer = new carroPersonal(marca, referencia, color, rines, cojineria, precio);

        listaCarroPersonal.add(carPer);

    }
    /**
     * Metodo que muestra carro personal.
     */
    public void verCarroPer() {
        quemarCarros();
        for (int carPer = 0; carPer < listaCarroPersonal.size(); carPer++) {

            System.out.println("Marca: " + listaCarroPersonal.get(carPer).getMarca());
            System.out.println("Referencia: " + listaCarroPersonal.get(carPer).getReferencia());
            System.out.println("Color: " + listaCarroPersonal.get(carPer).getColor());
            System.out.println("Rines: " + listaCarroPersonal.get(carPer).getRines());
            System.out.println("Cojineria: " + listaCarroPersonal.get(carPer).getCojineria());
            System.out.println("Precio " + listaCarroPersonal.get(carPer).getPrecio());

        }
    }
    /**
     * 
     * Metodo que modifica carro personal.
     */
    public void modifCarroPer() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String refModif;
        String marca;
        String color;
        String rines;
        String cojineria;
        int precio;

        System.out.println("Referencia del carro a modificar: ");
        refModif = br.readLine();

        for (int i = 0; i < listaCarroPersonal.size(); i++) {

            if (listaCarroPersonal.get(i).getReferencia().equals(refModif)) {
                
                System.out.println("Marca: " + listaCarroPersonal.get(i).getMarca());
                System.out.println("Modificar por: ");
                marca = br.readLine();
                System.out.println("Referencia: " + refModif);
                System.out.println("Color: " + listaCarroPersonal.get(i).getColor());
                System.out.println("Modificar por: ");
                color = br.readLine();
                System.out.println("Rines: " + listaCarroPersonal.get(i).getRines());
                System.out.println("Modificar por: ");
                rines = br.readLine();
                System.out.println("Cojineria: " + listaCarroPersonal.get(i).getCojineria());
                System.out.println("Modificar por: ");
                cojineria = br.readLine();
                System.out.println("Precio: " + listaCarroEst.get(i).getPrecio());
                System.out.println("Modificar por: ");
                precio = Integer.parseInt(br.readLine());

                listaCarroPersonal.get(i).setMarca(marca);
                listaCarroPersonal.get(i).setColor(color);
                listaCarroPersonal.get(i).setRines(rines);
                listaCarroPersonal.get(i).setCojineria(cojineria);
                listaCarroPersonal.get(i).setPrecio(precio);
            }
        }
    }
    /**
     * 
     * Metodo que elimina carro personal.
     */
    public void eliminarCarroPer() throws IOException {

        String refElim;
        System.out.println("Referencia del carro a eliminar: ");
        refElim = br.readLine();

        for (int el = 0; el < listaCarroPersonal.size(); el++) {
            if (listaCarroPersonal.get(el).getReferencia().equals(refElim)) {
                listaCarroPersonal.remove(el);

                System.out.println("Referencia " + refElim.toUpperCase() + " eliminado");
            }
        }

    }

    /////////////////////////////////
    /**
     * Metodo de vender Deportivo 
     */
    public void venderDep() throws IOException {
        quemarCarros();
        String refVenD, cedula;

        System.out.println("Dijite la referencia del deportivo a vender: ");
        refVenD = br.readLine();
        cedula = asigVendedor();
        for (int i = 0; i < listaCarroDep.size(); i++) {
            if (listaCarroDep.get(i).getReferencia().equals(refVenD)) {
                System.out.println("Marca: " + listaCarroDep.get(i).getMarca());
                System.out.println("Referencia: " + listaCarroDep.get(i).getReferencia());
                System.out.println("Color: " + listaCarroDep.get(i).getColor());
                System.out.println("Precio " + listaCarroDep.get(i).getPrecio());
                System.out.println("Velocidad: " + listaCarroDep.get(i).getVelocidad());

                
                agregarVenta(listaCarroDep.get(i).getMarca(), listaCarroDep.get(i).getReferencia(), listaCarroDep.get(i).getColor(), listaCarroDep.get(i).getPrecio(), listaCarroDep.get(i).getVelocidad());
            }
        }
    }
    /**
     * Metodo para asignar vendedor
     */
    public String asigVendedor() throws IOException {

        quemarVendedor();
        String cedula;

        System.out.println("Cedula del vendedor: ");
        cedula = (br.readLine());

        for (int i = 0; i < listaVendedor.size(); i++) {
            if (listaVendedor.get(i).getCedula().equals(cedula)) {
                {

                    System.out.println("Nombre: " + listaVendedor.get(i).getNombre());
                    System.out.println("Cédula: " + cedula);
                    
                }
            }
        }
        return cedula;
    }

    public void agregarVenta(String marca,String referencia, String color, int precio, String velocidad) {       
        factura f = new factura();
        
        v = new venta(0, marca, referencia, color, 0, velocidad);
        f.agregarVenta(v);
    }
    /**
     * Metodo carros ya existentes
     */
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
    /**
     * Metodo vendedor ya existente
     */
    public void quemarVendedor() {

        vendedor vend1 = new vendedor("Pedro", "123456", 320156, "concesionario 2", 0);
        vendedor vend2 = new vendedor("Jose", "78999", 310231, "concesionario 3", 0);
        listaVendedor.add(vend1);
        listaVendedor.add(vend2);
    }
}
