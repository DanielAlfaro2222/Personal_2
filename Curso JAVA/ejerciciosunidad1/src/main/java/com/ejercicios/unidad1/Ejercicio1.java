package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main( String[] args )
    {
        // Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) y calcule su número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.

        Scanner ingreso = new Scanner(System.in);//Creamos una instancia de la clase scanner.

        String FechaNacimiento = ""; //Creamos una variable tipo string en donde se almacenara la fecha.

        System.out.print("Ingrese su fecha de nacimiento en el siguiente formato dia/mes/año: ");//Imprimir mensaje al usuario, sobre que debe ingresar.

        FechaNacimiento = ingreso.nextLine();//Almacenamos la fecha ingresada por el usuario.

        String[] ArrayFechaNacimiento = FechaNacimiento.split("/");//Crear un array apartir de la fecha, en el cual se almacenara solo el dia, mes y el año.

        int[] ArrayFechaNacimientoNumerosEnteros = new int[3];//Crear un array en donde se van a almacenar el dia, mes y el año en forma de numero entero.

        for (int i = 0; i < ArrayFechaNacimiento.length; i++) {//Bucle for para almacenar los numeros despues de pasarlos a tipo entero.
            ArrayFechaNacimientoNumerosEnteros[i] = Integer.parseInt(ArrayFechaNacimiento[i]);
        }

        int TotalFechaNacimiento = 0; //Acumulador de la suma de toda la fecha de nacimiento.

        for (int num: ArrayFechaNacimientoNumerosEnteros) { //Bucle for each que acumula cada dato presente en el array donde la fecha de nacimiento esta en numeros enteros.
            TotalFechaNacimiento += num;
        }

        String SumaFechaNacimiento = String.valueOf(TotalFechaNacimiento);

        int NumeroDeLaSuerte = 0;
        for (int i = 0; i < SumaFechaNacimiento.length(); i++) {
            NumeroDeLaSuerte += Character.getNumericValue(SumaFechaNacimiento.charAt(i));
        }

        System.out.println("\nEl numero de la suerte es: " + NumeroDeLaSuerte);
    }
}
