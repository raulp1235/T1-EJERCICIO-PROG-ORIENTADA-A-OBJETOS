/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author reilx
 */

public class Mavenproject1 {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1001);

        pedido1.agregarPlato("Lomo", 25, 2);
        pedido1.agregarPlato("Chaufa", 18, 1);

        pedido1.mostrarResumen();
    }
}
