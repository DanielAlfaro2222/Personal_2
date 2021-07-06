package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        //Realizar un programa que calcule el sueldo de un trabajador, el programa solicita el número de horas que has trabajado en un mes, las horas se pagan a $30.000

        Scanner ingreso = new Scanner(System.in);

        long ValorHora = 30000;
        long Sueldo = 0;
        int NumeroHoras = 0;

        System.out.print("Ingrese el numero de horas trabajadas durante el mes: ");
        NumeroHoras = ingreso.nextInt();

        Sueldo = ValorHora * NumeroHoras;

        System.out.println("\nEl sueldo por " + NumeroHoras + " horas trabajadas durante el mes es: $" + Sueldo);
    }
}
