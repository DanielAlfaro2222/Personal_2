package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        // Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la tabla y mostrar los datos.

        Scanner ingreso = new Scanner(System.in);

        int Numero = 0;

        System.out.print("Ingrese un numero el cual desee generar la tabla de multiplicar: ");
        Numero = ingreso.nextInt();

        System.out.println("\n*********Tabla de multiplicar de el numero " + Numero + "*********");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Numero + " X " + i + " = " + (Numero * i));
        }
    }
}
