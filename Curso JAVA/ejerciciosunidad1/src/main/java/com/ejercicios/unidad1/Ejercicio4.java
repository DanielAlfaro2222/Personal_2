package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        // Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        Scanner ingreso = new Scanner(System.in);

        double Velocidad = 0;

        System.out.print("Ingrese la velocidad en km/h: ");
        Velocidad = ingreso.nextDouble();

        double VelocidadMetros = Velocidad * 0.2777777777777778;

        System.out.println("\nEl resultado de la conversion de la velocidad " + Velocidad + "KM/H a M/S es: " + VelocidadMetros);
    }
}
