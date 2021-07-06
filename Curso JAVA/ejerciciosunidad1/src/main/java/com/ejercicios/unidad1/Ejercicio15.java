package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        //Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.

        Scanner ingreso = new Scanner(System.in);

        int Numero = 0;

        System.out.print("Ingrese un numero: ");
        Numero = ingreso.nextInt();

        int Acumulador = 0;

        for (int i = 1; i <= Numero; i++) {
            int Factorial = 1;
            for (int j = 1; j <= i ; j++) {
                Factorial *= j;
            }
            Acumulador += Factorial;
        }
        System.out.println("\nLa suma total de la suma de los factoriales hasta " + Numero + " es " + Acumulador);
    }
}
