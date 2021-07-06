package com.ejercicios.unidad1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        //Programa que pase de pesos a dólares y viceversa.

        Scanner ingreso = new Scanner(System.in);

        double Dinero = 0;
        double Conversion = 0;
        int Usuario = 0;

        System.out.print("Ingrese 1 si quiere pasar dolares a pesos o 2 si quiere pasar pesos a dolares: ");
        Usuario = ingreso.nextInt();

        System.out.print("\nIngrese el dinero a convertir: ");
        Dinero = ingreso.nextDouble();

        switch(Usuario){
            case 1:
                Conversion = Dinero * 3.775;
                System.out.println("La conversion de " + Dinero + " $US a COP es: $"  + Conversion + " COP");
                break;
            case 2:
                Conversion = Dinero * 0.00027;
                System.out.println("La conversion de " + Dinero + " $COP a US es: $"  + Conversion + " US");
                break;
            default:
                System.out.println("\nError seleccion incorrecta");
        }
    }
}
