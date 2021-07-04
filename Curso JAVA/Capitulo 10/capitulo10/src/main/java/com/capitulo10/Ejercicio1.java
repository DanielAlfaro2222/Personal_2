package com.capitulo10;

import java.util.Scanner;

public class Ejercicio1{
    public static void main( String[] args ){

        // Construir un programa Java que llene una matriz de 5 filas por 3 columnas y que calcule la suma de todos los datos almacenados en la matriz

        Scanner ingreso = new Scanner(System.in);

        int[][] Matriz = new int[5][3];

        for (int i = 0; i < 5; i++) {
            System.out.println("********Fila " + (i + 1) + "********");
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero: ");   
                Matriz[i][j] = ingreso.nextInt();
            }
        }

        int Acumulador = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Acumulador += Matriz[i][j];
            }
        }

        System.out.println("\nEl resultado de la suma de todos los numeros presentes en la matriz es: " + Acumulador);
    }
}
