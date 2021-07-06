package com.ejercicios.unidad1;

import java.util.Scanner;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        //Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que adivinar introduciendo el número por teclado. En el caso que el número a adivinar sea mayor al ingresado, decirle al usuario “El número que busca es mayor”, de lo contrario, “El número que busca es menor”. El programa finalizará cuando se introduzca el número correcto. Nota: usar la clase Random para generar el número aleatorio.

        boolean NumeroEncontrado = true;

        Scanner ingreso = new Scanner(System.in);

        int NumeroAleatorio = (int)(Math.random() * 100);
        int NumeroUsuario = 0;

        System.out.println("\n********PROGRAMA QUE TOMA UN NUMERO ALEATORIO ENTRE 1 Y 100 Y EL USUARIO DEBE ADIVINAR QUE NUMERO ES********\n");

        while(NumeroEncontrado){

            System.out.print("\nIngrese el numero: ");
            NumeroUsuario = ingreso.nextInt();

            if(NumeroUsuario > NumeroAleatorio){
                System.out.println("\nEl número que busca es menor");
            }else if(NumeroUsuario < NumeroAleatorio){
                System.out.println("\nEl número que busca es mayor");
            }else if(NumeroUsuario == NumeroAleatorio){
                System.out.println("\nFelicitaciones encontro el numero, el numero aleatorio es: " + NumeroAleatorio);
                NumeroEncontrado = false;
            }
        }
    }
}
