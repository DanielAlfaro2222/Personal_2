package com.capitulo9;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        // Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine cuántas veces está el número menor

        Scanner ingreso = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            Array[i] = ingreso.nextInt();
        }

        int NumeroMenor = Array[0];
        int CantidadVeces = 0;

        for (int num: Array) {
            if(num < NumeroMenor){
                NumeroMenor = num;
            }
        }

        for (int num: Array) {
            if(NumeroMenor == num){
                CantidadVeces += 1;
            }
        }

        System.out.println("\nEl numero menor es " + NumeroMenor + ", esta " + CantidadVeces + " vez/veces en el array");

    }
}
