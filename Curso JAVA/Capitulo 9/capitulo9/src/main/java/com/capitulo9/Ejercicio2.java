package com.capitulo9;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine en qué posición está el número mayor

        Scanner ingreso = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero: ");
            Array[i] = ingreso.nextInt();
        }

        int NumeroMayor = Array[0];
        int Posicion = 0;

        for (int i = 0; i < Array.length; i++) {
            
            if(Array[i] > NumeroMayor){
                NumeroMayor = Array[i];
                Posicion = i;
            }
        }

        System.out.println("\nEl numero mayor es " + NumeroMayor + ", su posicion en el array es " + Posicion);
    }
}
