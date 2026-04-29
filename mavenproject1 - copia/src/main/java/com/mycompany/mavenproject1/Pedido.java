/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author reilx
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    private int idPedido;
    private ArrayList<String> nombresPlatos;
    private ArrayList<Double> preciosPlatos;
    private ArrayList<Integer> cantidadesPlatos;


    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        nombresPlatos = new ArrayList<>();
        preciosPlatos = new ArrayList<>();
        cantidadesPlatos = new ArrayList<>();
    }


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }


    private boolean validarNombre(String nombre) {
        return !nombre.isEmpty();
    }

    private boolean validarPrecio(double precio) {
        return precio > 0;
    }


    private boolean validarCantidad(int cantidad) {
        return cantidad > 0;
    }


    public boolean buscarPlato(String nombre) {
        return nombresPlatos.contains(nombre);
    }


    public void agregarPlato(String nombre, double precio, int cantidad) {

        if (!validarNombre(nombre)) {
            System.out.println("Nombre inválido.");
            return;
        }

        if (!validarPrecio(precio)) {
            System.out.println("Precio inválido.");
            return;
        }

        if (!validarCantidad(cantidad)) {
            System.out.println("Cantidad inválida.");
            return;
        }

        if (buscarPlato(nombre)) {
            System.out.println("El plato ya existe.");
            return;
        }

        nombresPlatos.add(nombre);
        preciosPlatos.add(precio);
        cantidadesPlatos.add(cantidad);

        System.out.println("Plato agregado correctamente.");
    }


    public double calcularTotal() {

        if (nombresPlatos.isEmpty()) {
            System.out.println("Pedido vacío.");
            return 0;
        }

        double total = 0;

        for (int i = 0; i < nombresPlatos.size(); i++) {
            total = total + (preciosPlatos.get(i) * cantidadesPlatos.get(i));
        }

        return total;
    }


    public void mostrarResumen() {

        if (nombresPlatos.isEmpty()) {
            System.out.println("No hay platos registrados.");
            return;
        }

        System.out.println("------ RESUMEN DEL PEDIDO ------");
        System.out.println("ID Pedido: " + idPedido);

        for (int i = 0; i < nombresPlatos.size(); i++) {
            System.out.println("Plato: " + nombresPlatos.get(i) +
                    " | Precio: " + preciosPlatos.get(i) +
                    " | Cantidad: " + cantidadesPlatos.get(i));
        }

        System.out.println("TOTAL A PAGAR: " + calcularTotal());
    }


    public void eliminarPlato(String nombre) {

        int posicion = nombresPlatos.indexOf(nombre);

        if (posicion == -1) {
            System.out.println("Plato no encontrado.");
            return;
        }

        nombresPlatos.remove(posicion);
        preciosPlatos.remove(posicion);
        cantidadesPlatos.remove(posicion);

        System.out.println("Plato eliminado.");
    }

}