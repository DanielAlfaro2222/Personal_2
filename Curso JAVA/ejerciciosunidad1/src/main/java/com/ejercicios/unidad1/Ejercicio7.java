package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        // Programa que lea un carácter por teclado y compruebe si es una letra mayúscula

        Scanner ingreso = new Scanner(System.in);

        char Caracter = '0';

        System.out.print("Ingrese una letra: ");
        Caracter = ingreso.next().charAt(0);

        char CaracterEnMayuscula = Character.toUpperCase(Caracter);

        String Respuesta = (Caracter == CaracterEnMayuscula) ? "\nLa letra esta en mayuscula" : "\nLa letra no esta en mayuscula";

        System.out.println(Respuesta);
    }
}
