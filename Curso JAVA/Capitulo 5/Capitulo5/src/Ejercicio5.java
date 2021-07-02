import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe dos cadenas y las imprime concatenadas");

        Scanner ingreso = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.println("Ingrese la primer cadena: ");
        cadena1 = ingreso.nextLine();

        System.out.println("Ingrese la segunda cadena: ");
        cadena2 = ingreso.nextLine();

        System.out.println("\nCadena concatenada: " + cadena1.concat(cadena2));
    }
}
