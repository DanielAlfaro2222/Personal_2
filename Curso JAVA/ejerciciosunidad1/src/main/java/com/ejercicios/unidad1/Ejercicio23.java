package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        //Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y volver a pensar.

        Scanner ingreso = new Scanner(System.in);

        int Numero = 0;
        int Usuario = 0;

        while(true){

            System.out.print("\nIngrese un numero: ");
            Numero = ingreso.nextInt();

            String Respuesta = (Numero % 2 == 0) ? "\nEl numero " + Numero + " es par" : "\nEl numero " + Numero + " es impar";

            System.out.println("\n" + Respuesta);

            System.out.print("\nDesea seguir ingresando datos 1 para si o 2 para no: ");
            Usuario = ingreso.nextInt();

            if(Usuario != 1){
                break;
            }
        }
    }
}
