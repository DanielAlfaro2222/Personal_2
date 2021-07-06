package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        //Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar en pantalla “La <operación> de <número 1> y <número 2> es igual a <resultado> ”.

        Scanner ingreso = new Scanner(System.in);

        int Num1 = 0;
        int Num2 = 0;

        System.out.print("Ingrese el primer numero: ");
        Num1 = ingreso.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        Num2 = ingreso.nextInt();

        System.out.println("\nLa suma de " + Num1 + " y " + Num2 + " es igual " + (Num1 + Num2));
        System.out.println("\nLa resta de " + Num1 + " y " + Num2 + " es igual " + (Num1 - Num2));
        System.out.println("\nLa multiplicacion de " + Num1 + " y " + Num2 + " es igual " + (Num1 * Num2));
        System.out.println("\nLa division de " + Num1 + " y " + Num2 + " es igual " + (Num1 / Num2));
    }
}
