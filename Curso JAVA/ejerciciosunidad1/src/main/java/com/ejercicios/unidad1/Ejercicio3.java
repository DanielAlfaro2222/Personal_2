package com.ejercicios.unidad1;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        // Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras

        Scanner ingreso = new Scanner(System.in);

        int N = 0;
        int M = 0;

        System.out.print("Ingrese el valor de la variable N: ");
        N = ingreso.nextInt();

        System.out.print("Ingrese el valor de la variable M: ");
        M = ingreso.nextInt();
        
        String Numero = String.valueOf(N);

        if(M > N || M == N){
            System.out.println("\nError M es mayor que N o ambas variables son iguales, por ende no se puede realizar la operacion");
        }else if(Numero.length() < M){
            char PrimerNumero = Numero.charAt(0);
            System.out.println("\n" + PrimerNumero);
        }else{
            String Resultado = Numero.substring(0,Numero.length() - M);
            System.out.println("\n" + Resultado);
        }
    }
}
