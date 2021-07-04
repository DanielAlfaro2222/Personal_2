package com.capitulo9;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        // Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine en qué posición está el menor número terminado en 3

        Scanner ingreso = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Array[i] = ingreso.nextInt();
        }

        int NumeroMenor = 2147483647;
        int Posicion = 0;

        for (int i = 0; i < Array.length; i++) {
            if(Array[i] % 10 == 3 && Array[i] < NumeroMenor){
                NumeroMenor = Array[i];
                Posicion = i;
            }
        }

        System.out.println("\nEl menor numero terminado en 3 es " + NumeroMenor + ", esta en la posicion " + Posicion + " del array");
    }
}
