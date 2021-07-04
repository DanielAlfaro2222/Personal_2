package com.capitulo10;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // Construir un programa Java que llene una matriz de 3 filas por 6 columnas (3x6) y que calcule la suma de cada fila de datos de la matriz

        Scanner ingreso = new Scanner(System.in);

        int[][] Matriz = new int[3][6];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n**********Fila " + (i + 1) + "**********");
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingrese un numero: ");
                Matriz[i][j] = ingreso.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n**********Fila " + (i + 1) + "**********");
            for (int j = 0; j < 6; j++) {
                System.out.print(Matriz[i][j] + "-");
            }
        }

        System.out.println("");

        int Acumulador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                Acumulador += Matriz[i][j];        
            }
            System.out.println("\nTotal suma fila " + (i + 1) + ": " + Acumulador);
            Acumulador = 0;
        }
    }
}
