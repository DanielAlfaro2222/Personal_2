package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto, el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.

        Scanner ingreso = new Scanner(System.in);

        int PrecioUnidad = 0;
        int CantidadProductos = 0;
        double Iva = 0;

        System.out.print("Ingrese el precio unitario de el producto: ");
        PrecioUnidad = ingreso.nextInt();

        System.out.print("Ingrese la cantidad de productos comprados: ");
        CantidadProductos = ingreso.nextInt();

        System.out.print("Ingrese el valor del iva: ");
        Iva = ingreso.nextDouble();

        double Total = (PrecioUnidad * CantidadProductos) - ((PrecioUnidad * CantidadProductos) * (Iva/100));

        System.out.println("\nEl total a pagar es: " + Total + " COP");
    }
}
