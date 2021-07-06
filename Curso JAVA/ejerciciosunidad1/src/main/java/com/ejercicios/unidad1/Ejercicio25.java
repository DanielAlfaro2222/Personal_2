package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio25 {
    
    public static void main(String[] args) {
        
        // Pide por teclado el nombre, edad y salario y muestra el salario
        //     ○ Si es menor de 16 no tiene edad para trabajar
        //     ○ Entre 19 y 50 años el salario es un 5 por ciento más
        //     ○ Entre 51 y 60 años el salario es un 10 por ciento más
        //     ○ Si es mayor de 60 el salario es un 15 por ciento más

        Scanner ingreso = new Scanner(System.in);

        String Nombre = "";
        int Edad = 0;
        int Salario = 0;

        System.out.print("Ingrese su nombre: ");
        Nombre = ingreso.nextLine();

        System.out.print("Ingrese su edad: ");
        Edad = ingreso.nextInt();

        System.out.print("Ingrese su salario: ");
        Salario = ingreso.nextInt();

        if(Edad < 16){
            System.out.println("\nLa persona " + Nombre + " no tiene edad para trabajar");
        }else if(Edad > 18 && Edad < 51){
            Salario += Salario * 0.05;
            System.out.println("\nLa persona " + Nombre + " tiene como salario $" + Salario);
        }else if(Edad > 50 && Edad < 61){
            Salario += Salario * 0.1;
            System.out.println("\nLa persona " + Nombre + " tiene como salario $" + Salario);
        }else if(Edad > 60){
            Salario += Salario * 0.15;
            System.out.println("\nLa persona " + Nombre + " tiene como salario $" + Salario);
        }
    }
}
