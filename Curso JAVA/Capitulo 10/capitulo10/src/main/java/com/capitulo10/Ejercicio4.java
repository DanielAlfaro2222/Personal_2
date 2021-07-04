package com.capitulo10;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {

        //Construir un programa Java que llene una matriz 3x5 y que determine cuál es el valor menor de cada fila de la matriz

        Scanner ingreso = new Scanner(System.in);

        int[][] Matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("**************Fila " + (i + 1) + "**************");
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese un numero: ");
                Matriz[i][j] = ingreso.nextInt();
            }
        }

        int MenorValor = 0;

        for (int i = 0; i < 3; i++) {
            MenorValor = Matriz[i][0];
            for (int j = 0; j < 5; j++) {
                if(Matriz[i][j] < MenorValor){
                    MenorValor = Matriz[i][j];
                }
            }
            System.out.println("\nMenor valor fila " + (i + 1) + ": " + MenorValor);
        }
    }
}
