package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        //Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

        Scanner ingreso = new Scanner(System.in);

        int Hora = 0;
        int Minutos = 0;
        int Segundos = 0;

        System.out.print("Ingrese la hora: ");
        Hora = ingreso.nextInt();

        System.out.print("Ingrese los Minutos: ");
        Minutos  = ingreso.nextInt();

        System.out.print("Ingrese los segundos: ");
        Segundos = ingreso.nextInt();

        Boolean HoraValida = true;

        if(Hora < 1 || Hora > 12){
            HoraValida = false;
        }else if(Minutos < 0 || Minutos > 59){
            HoraValida = false;
        }else if(Segundos < 0 || Segundos > 59){
            HoraValida = false;
        }

        String Respuesta = (HoraValida) ? "\nLa hora ingresada " + Hora + ":" + Minutos + ":" + Segundos + " es valida" : "\nLa hora ingresada " + Hora + ":" + Minutos + ":" + Segundos + " no es valida";

        System.out.println(Respuesta);
    }
}
