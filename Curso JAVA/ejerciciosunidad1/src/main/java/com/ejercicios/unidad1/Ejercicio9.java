package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        //El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.

        Scanner ingreso = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.print("Ingrese el primer numero: ");
        num1 = ingreso.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = ingreso.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        num3 = ingreso.nextInt();

        int NumeroMayor = 0;

        if(num1 > num2 && num1 > num3){
            NumeroMayor = num1;
        }else if(num2 > num1 && num2 > num3){
            NumeroMayor = num2;
        }else{
            NumeroMayor = num3;
        }

        System.out.println("\nEl numero mayor es: " + NumeroMayor);
    }
}
