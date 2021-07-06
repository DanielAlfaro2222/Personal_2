package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        // Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12

        String[][] Meses = {{"Enero", "31"}, {"Febrero", "28"}, {"Marzo", "31"}, {"Abril", "30"}, {"Mayo","31"}, {"Junio", "30"}, {"Julio", "31"}, {"Agosto", "31"}, {"Septiembre", "30"}, {"Octubre", "31"}, {"Noviembre", "30"}, {"Diciembre", "31"}};

        int Mes = 0;

        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese el numero del mes: ");
        Mes = ingreso.nextInt();

        String Respuesta = (Mes > 0 || Mes < 13) ? "\nEl mes ingresado es " + Meses[Mes - 1][0] + " y tiene " + Meses[Mes - 1][1] + " dias": "\nError numero de mes incorrecto";

        System.out.println(Respuesta);
    }
}
