package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        //Realizar un programa que realice el promedio de las notas de un alumno, para ello el programa va a tener que solicitar el nombre del alumno y las notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir “Reprobado” . Requisitos: Las notas que se ingresan pueden tener decimales.

        Scanner ingreso = new Scanner(System.in);

        Double Nota1 = 0.0;
        Double Nota2 = 0.0;
        Double Nota3 = 0.0;
        String Nombre = "";

        System.out.print("Ingrese su nombre: ");
        Nombre = ingreso.nextLine();

        System.out.print("Ingrese la primer nota: ");
        Nota1 = ingreso.nextDouble();

        while(Nota1 < 0 || Nota1 > 5.0){
            System.out.print("\nError ingrese un valor valido para la primera nota: ");
            Nota1 = ingreso.nextDouble();
        }

        System.out.print("Ingrese la segunda nota: ");
        Nota2 = ingreso.nextDouble();

        while(Nota2 < 0 || Nota2 > 5.0){
            System.out.print("\nError ingrese un valor valido para la segunda nota: ");
            Nota2 = ingreso.nextDouble();
        }

        System.out.print("Ingrese la tercer nota: ");
        Nota3 = ingreso.nextDouble();

        while(Nota3 < 0 || Nota3 > 5.0){
            System.out.print("\nError ingrese un valor valido para la tercer nota: ");
            Nota3 = ingreso.nextDouble();
        }

        Double Promedio = (Nota1 + Nota2 + Nota3) / 3;

        String Respuesta = (Promedio >= 3.0) ? "\nEl estudiante " + Nombre + " aprobo la materia" : "\nEl estudiante " + Nombre + " no aprobo la materia";

        System.out.println(Respuesta);
    }
}
