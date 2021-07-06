package com.ejercicios.unidad1;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        String Cadena = "ZYWXVUTSRQPONMLKJIHGFEDCBA";

        for (int i = 0; i < Cadena.length(); i++) {
            System.out.println(Cadena.substring(i, Cadena.length()));
        }
    }
}
