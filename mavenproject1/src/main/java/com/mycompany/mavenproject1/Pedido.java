package com.mycompany.mavenproject1;

import java.util.ArrayList;

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

    public void agregarPlato(String nombre, double precio, int cantidad) {
        nombresPlatos.add(nombre);
        preciosPlatos.add(precio);
        cantidadesPlatos.add(cantidad);
        System.out.println("Plato agregado.");
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < nombresPlatos.size(); i++) {
            total = total + (preciosPlatos.get(i) * cantidadesPlatos.get(i));
        }

        return total;
    }

    public void mostrarResumen() {
        System.out.println("------ RESUMEN ------");
        for (int i = 0; i < nombresPlatos.size(); i++) {
            System.out.println("Plato: " + nombresPlatos.get(i) +
                    " Precio: " + preciosPlatos.get(i) +
                    " Cantidad: " + cantidadesPlatos.get(i));
        }
        System.out.println("Total: " + calcularTotal());
    }
}