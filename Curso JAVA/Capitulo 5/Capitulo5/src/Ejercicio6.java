import java.util.Scanner;

import javax.swing.RepaintManager;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe dos cadenas y evalua si la primer cadena esta dentro de la segunda");

        Scanner ingreso = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.println("Ingrese la primer cadena: ");
        cadena1 = ingreso.nextLine();

        System.out.println("Ingrese la segunda cadena: ");
        cadena2 = ingreso.nextLine();

        String respuesta = (cadena2.contains(cadena1)) ? "\nLa primer cadena si esta dentro de la segunda cadena" : "\nNo la contiene";

        System.out.println(respuesta);
    }
}
