package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        //Mostrar los N primeros términos de la serie de Fibonacci.

        Scanner ingreso = new Scanner(System.in);

        int Numero = 0;

        System.out.print("Ingrese un numero: ");
        Numero = ingreso.nextInt();

        System.out.println("\nSucesion de fibonacci hasta N terminos");

        int PrimerTermino = 0;
        int SegundoTermino = 1;
        int TercerTermino = 0;

        System.out.print(PrimerTermino + "-" + SegundoTermino + "-");

        for (int i = 0; i < Numero - 2; i++) {
            TercerTermino = PrimerTermino + SegundoTermino;
            System.out.print(TercerTermino + "-");
            PrimerTermino = SegundoTermino;
            SegundoTermino = TercerTermino;
        }
    }
}
