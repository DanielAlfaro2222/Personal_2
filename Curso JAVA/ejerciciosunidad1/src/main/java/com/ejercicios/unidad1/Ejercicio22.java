package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        //Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y que calcule el peso ideal.

        //  ○ peso ideal mujeres = altura - 120
        //  ○ peso ideal hombres = altura - 110

        Scanner ingreso = new Scanner(System.in);

        char Genero = '0';
        int Altura = 0;

        System.out.print("Ingrese H o M segun su genero: ");
        Genero = ingreso.nextLine().toLowerCase().charAt(0);

        System.out.print("Ingrese su altura: ");
        Altura = ingreso.nextInt();

        String Respuesta = (Genero == 'h') ? "\nSu peso ideal es: " + (Altura - 110) + "kg" : "\nSu peso ideal es: " + (Altura - 120) + "kg";

        System.out.println(Respuesta);
    }
}
