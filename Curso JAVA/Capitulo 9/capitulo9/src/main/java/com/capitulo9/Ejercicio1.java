package com.capitulo9;

import java.util.Scanner;

public class Ejercicio1{

    public static void main( String[] args ){

        /*
            Construir un programa que lea un conjunto de 10 datos y, después de leídos, determine en qué posición está el número menor.
        */

        Scanner ingreso = new Scanner(System.in); //Crear una instancia de la clase scanner

        int[] Array = new int[10]; // Definir el array de numeros enteros con 10 posiciones

        for (int i = 0; i < 10; i++) {
            
            System.out.print("Ingrese un numero: "); //Mostrar mensaje al usuario sobre que debe ingresar
            Array[i] = ingreso.nextInt(); //Almacenar en el array, el numero ingresado
        }

        int NumeroMenor = Array[0];

        for (int num: Array) {
            
            if (num < NumeroMenor){
                NumeroMenor = num;
            }
        }

        System.out.println("\nEl numero menor es: " + NumeroMenor);
    }
}
