import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe dos cadenas y evalua si ambas cadenas son iguales");

        Scanner ingreso = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.println("Ingrese la primer cadena de caracteres: ");
        cadena1 = ingreso.nextLine();

        System.out.println("Ingrese la segunda cadena de caracteres: ");
        cadena2 = ingreso.nextLine();

        String Respuesta = (cadena1.equals(cadena2)) ? "\nSon iguales" : "\nNo son iguales";

        System.out.println(Respuesta);
    }
}
