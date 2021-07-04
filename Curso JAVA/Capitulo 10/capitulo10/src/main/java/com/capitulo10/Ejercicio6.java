package com.capitulo10;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        //Construir un programa Java que llene una matriz 3x8 y que determine en qué posición está el valor mayor de cada fila.

        Scanner ingresar = new Scanner(System.in);

        int[][] Matriz = new int[3][8];

        for (int i = 0; i < 3; i++) {
            System.out.println("*************Fila " + (i + 1) + "*************");
            for (int j = 0; j < 8; j++) {
                System.out.print("Ingrese un numero: ");
                Matriz[i][j] = ingresar.nextInt();
            }
        }

        int[] Posicion = new int[2];
        int NumeroMayor = 0;

        for (int i = 0; i < 3; i++) {
            NumeroMayor = Matriz[i][0];
            Posicion[0] = 0;
            Posicion[1] = 0;
            for (int j = 0; j < 8; j++) {
                if(Matriz[i][j] > NumeroMayor){
                    NumeroMayor = Matriz[i][j];
                    Posicion[0] = i;
                    Posicion[1] = j;
                }
            }

            System.out.println("\nFila: " + (i + 1) + " Numero mayor: " + NumeroMayor + " Posicion: (" + Posicion[0] + "," + Posicion[1] + ")");
        }
    }
}
