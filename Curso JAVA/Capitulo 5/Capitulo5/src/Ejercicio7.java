import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        System.out.println("Programa que recibe dos cadenas e imprime si la segunda cadena empieza con la primer cadena");

        Scanner ingreso = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.println("Ingresar la primer cadena: ");
        cadena1 = ingreso.nextLine();

        System.out.println("Ingresar la segunda cadena: ");
        cadena2 = ingreso.nextLine();

        String respuesta = (cadena2.startsWith(cadena1)) ? "\nLa segunda cadena si empieza por la primer cadena" : "\nLa segunda cadena no empieza por la primer cadena";

        System.out.println(respuesta);
    }
}
