package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        // Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        Scanner ingreso = new Scanner(System.in);

        Double num1 = 0.0;
        Double num2 = 0.0;

        System.out.print("Ingrese el primer numero: ");
        num1 = ingreso.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = ingreso.nextDouble();

        String Resultado = String.valueOf(num1 / num2);  

        String Respuesta = (num2 != 0) ? "\nEl resultado de la division es: " + Resultado : "\nNo se pudo realizar la division, el divisor es igual a cero";

        System.out.println(Respuesta);
    }
}
