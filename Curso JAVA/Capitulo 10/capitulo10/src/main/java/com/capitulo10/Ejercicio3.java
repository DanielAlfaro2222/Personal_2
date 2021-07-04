package com.capitulo10;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {

        // Construir un programa Java que llene un matriz de 6x4 y que determine cuál es el valor menor almacenado en toda la matriz

        Scanner ingreso = new Scanner(System.in);

        int[][] Matriz = new int[6][4];

        for (int i = 0; i < 6; i++) {
            System.out.println("*****************Fila " + (i + 1) + "*****************");
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un numero: ");
                Matriz[i][j] = ingreso.nextInt();
            }
        }

        int MenorValor = Matriz[0][0];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if(Matriz[i][j] < MenorValor){
                    MenorValor = Matriz[i][j];
                }
            }
        }

        System.out.println("\nEl menor valor de la matriz es: " + MenorValor);
    }
}
