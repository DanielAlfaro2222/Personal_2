package com.capitulo9;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine cuántos números pares hay en el vector

        Scanner ingreso = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Array[i] = ingreso.nextInt();
        }

        int CantidadNumerosPares = 0;

        for (int num : Array) {
            if(num % 2 == 0){
                CantidadNumerosPares += 1;
            }
        }

        System.out.println("\nLa cantidad de numeros pares presentes en el array es: " + CantidadNumerosPares);
    }
}
