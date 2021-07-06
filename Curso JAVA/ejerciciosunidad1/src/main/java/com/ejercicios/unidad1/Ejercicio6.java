package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        //Programa que lea un número entero y muestre si el número es múltiplo de 10.

        Scanner ingreso = new Scanner(System.in);

        int Num = 0;

        System.out.print("Ingrese un numero: ");
        Num = ingreso.nextInt();

        String Respuesta = (Num % 10 == 0) ? "\nEl numero es multiplo de 10": "\nEl numero no es multiplo de 10";

        System.out.println(Respuesta);
    }
}
