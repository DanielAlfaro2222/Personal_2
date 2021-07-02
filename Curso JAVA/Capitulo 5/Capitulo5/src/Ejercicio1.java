import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe una palabra y retorna el largo de la palabra");

        Scanner ingreso = new Scanner(System.in);
        String palabra = "";

        System.out.println("Ingrese la palabra: ");
        palabra = ingreso.nextLine();

        System.out.println("\nLa palabra " + palabra + " tiene como longitud: " + palabra.length());
    }
}
