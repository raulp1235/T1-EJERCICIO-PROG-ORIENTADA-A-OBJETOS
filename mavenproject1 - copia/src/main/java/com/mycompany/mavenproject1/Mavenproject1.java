package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido1 = new Pedido(1001);

        int opcion = 0;

        do {
            System.out.println("\n------ MENU PRINCIPAL ------");
            System.out.println("1. Agregar Plato");
            System.out.println("2. Mostrar Resumen");
            System.out.println("3. Calcular Total");
            System.out.println("4. Buscar Plato");
            System.out.println("5. Eliminar Plato");
            System.out.println("6. Salir");
            System.out.print("Seleccione opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); 

                switch (opcion) {

                    case 1:
                        try {
                            System.out.print("Nombre del plato: ");
                            String nombre = sc.nextLine();

                            System.out.print("Precio: ");
                            double precio = sc.nextDouble();

                            System.out.print("Cantidad: ");
                            int cantidad = sc.nextInt();
                            sc.nextLine();

                            pedido1.agregarPlato(nombre, precio, cantidad);

                        } catch (Exception e) {
                            System.out.println("Error de entrada.");
                            sc.nextLine();
                        }
                        break;

                    case 2:
                        pedido1.mostrarResumen();
                        break;

                    case 3:
                        System.out.println("Total a pagar: " + pedido1.calcularTotal());
                        break;

                    case 4:
                        System.out.print("Ingrese plato a buscar: ");
                        String buscar = sc.nextLine();

                        if (pedido1.buscarPlato(buscar)) {
                            System.out.println("El plato existe.");
                        } else {
                            System.out.println("El plato no existe.");
                        }
                        break;

                    case 5:
                        System.out.print("Ingrese plato a eliminar: ");
                        String eliminar = sc.nextLine();
                        pedido1.eliminarPlato(eliminar);
                        break;

                    case 6:
                        System.out.println("Fin del programa.");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }

            } catch (Exception e) {
                System.out.println("Debe ingresar un numero.");
                sc.nextLine();
            }

        } while (opcion != 6);
    }
}