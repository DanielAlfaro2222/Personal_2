package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        // Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

        Scanner ingreso = new Scanner(System.in);

        Double LadoA = 0.0;
        Double LadoB = 0.0;
        Double Hipotenusa = 0.0;

        System.out.print("Ingrese el valor del lado A: ");
        LadoA = ingreso.nextDouble();

        System.out.print("Ingrese el valor del lado B: ");
        LadoB = ingreso.nextDouble();

        Hipotenusa = Math.pow(LadoA, 2) + Math.pow(LadoB, 2);

        System.out.println("\nLa longitud de la hipotenusa es: " + Hipotenusa);
    }
}
