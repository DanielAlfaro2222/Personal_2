package com.ejercicios.unidad1;

public class Ejercicio12 {
    
    public static void main(String[] args) {

        // Realizar programa que muestre los números del 1 al 100 que no sean múltiplos de 3, utilizando cada una las instrucciones repetitivas (while, do while, for)

        //Usando el bucle for
        System.out.println("Numeros del 1 al 100 que no son multiplos de 3 usando el bucle for \n");
        for (int i = 1; i < 101; i++) {
            if(i % 3 != 0){
                System.out.print(i + "-");
            }
        }

        //Usando el bucle while
        System.out.println("\n\nNumeros del 1 al 100 que no son multiplos de 3 usando el bucle while\n");
        int i = 1;
        while(i != 101){
            if(i % 3 != 0){
                System.out.print(i + "-");
            }
            i++;
        }

        //Usando bucle do while
        System.out.println("\n\nNumeros del 1 al 100 que no son multiplos de 3 usando el bucle do while\n");

        int j = 1;
        do{
            if(j % 3 != 0){
                System.out.print(j + "-");
            }
            j++;
        }while(j != 101);
    }
}
