/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.T1OBJETOS;

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
}