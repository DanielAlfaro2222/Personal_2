package com.capitulo9;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        //Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine cuántos números impares hay en el vector

        Scanner ingreso = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Array[i] = ingreso.nextInt();
        }

        int CantidadNumerosImpares = 0;

        for (int num: Array) {
            if(num % 2 != 0){
                CantidadNumerosImpares += 1;
            }
        }

        System.out.println("\nCantidad de numeros impares presentes en el array: " + CantidadNumerosImpares);
    }
}
