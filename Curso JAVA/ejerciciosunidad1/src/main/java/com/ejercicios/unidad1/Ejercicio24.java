package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio24 {
    
    public static void main(String[] args) {
        
        // Realizar un programa que permita controlar el juego de piedra, papel, tijera introduciendo P para piedra, L para papel y T para tijera por cada jugador.El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final de cada ronda preguntar si desea volver a jugar.

        Scanner ingreso = new Scanner(System.in);

        System.out.println("***********Programa que simula el juego piedra, papel o tijera***********\n");

        int Usuario1 = 0;
        int Usuario2 = 0;
        int Continuar = 0;

        while(true){

            System.out.println("\n************Usuario1************");
            System.out.println("Opciones\n1)Piedra\n2)Papel\n3)Tijera\n");
            System.out.print("Ingrese el valor de su eleccion: ");
            Usuario1 = ingreso.nextInt();

            while(Usuario1 < 0 || Usuario1 > 3){
                System.out.print("\nError ingrese un valor correcto: ");
                Usuario1 = ingreso.nextInt(); 
            }

            System.out.println("\n************Usuario2************");
            System.out.println("Opciones\n1)Piedra\n2)Papel\n3)Tijera\n");
            System.out.print("Ingrese el valor de su eleccion: ");
            Usuario2 = ingreso.nextInt();

            while(Usuario1 < 0 || Usuario1 > 3){
                System.out.print("\nError ingrese un valor correcto: ");
                Usuario1 = ingreso.nextInt(); 
            }

            if(Usuario1 == 3 && Usuario2 == 2){
                System.out.println("\nRonda ganada por el usuario 1");
            }else if(Usuario1 == 2 && Usuario2 == 1){
                System.out.println("\nRonda ganada por el usuario 1");
            }else if(Usuario1 == 1 && Usuario2 == 3){
                System.out.println("\nRonda ganada por el usuario 1");
            }else if(Usuario1 == Usuario2){
                System.out.println("\nRonda empatada");
            }
            else{
                System.out.println("\nRonda ganada por el usuario 2");
            }

            System.out.print("\nIngrese 1 si desea seguir jugando 2 para terminar: ");
            Continuar = ingreso.nextInt();

            if(Continuar == 2){
                break;
            }
        }
    }
}
