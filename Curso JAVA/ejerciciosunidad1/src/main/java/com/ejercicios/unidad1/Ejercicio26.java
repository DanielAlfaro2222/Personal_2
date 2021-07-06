package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio26 {
    
    public static void main(String[] args) {
        
        //Muestra la serie de fibonacci hasta un número pedido por teclado. Por ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.

        int Numero = 0;
        int NumeroAnterior = 0;
        int NumeroActual = 1;
        int TercerNumero = 0;
        Scanner ingreso = new Scanner(System.in);

        //System.out.print("Ingrese un numero: ");
        //Numero = ingreso.nextInt();

        // System.out.println("\n*********Serie de fibonacci*********");
        System.out.print("0-1-");

        // while(true){
        //     TercerNumero = NumeroAnterior + NumeroActual;
        //     NumeroAnterior = NumeroActual;
        // }

        for (int i = 0; i < 5; i++) {
            TercerNumero = NumeroAnterior + NumeroActual;
            NumeroActual = NumeroAnterior;
            System.out.print(TercerNumero + "-");
        }
    }
}
