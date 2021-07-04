package com.capitulo10;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        // Construir un programa Java que llene una matriz 4x6 y que determine en qué posición (en qué fila y en qué columna) está el valor menor de toda la matriz

        Scanner ingreso = new Scanner(System.in);

        int[][] Matriz = new int[4][6];

        for (int i = 0; i < 4; i++) {
            System.out.println("*************Fila " + (i + 1) + "*************");
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingrese un numero: ");
                Matriz[i][j] = ingreso.nextInt();
            }
        }

        int MenorValor = Matriz[0][0];
        int[] Posicion = new int[2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if(Matriz[i][j] < MenorValor){
                    MenorValor = Matriz[i][j];
                    Posicion[0] = i;
                    Posicion[1] = j;
                }
            }
        }

        System.out.println("\nEl menor valor es " + MenorValor + ", y se encuentra en la posicion (" + Posicion[0] + "," + Posicion[1] + ") de la matriz");
    }
}
