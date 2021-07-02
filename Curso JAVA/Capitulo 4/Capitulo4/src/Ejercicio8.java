import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe un numero y calcula el logaritmo base 10 de este");

        int Numero = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("\nIngrese un numero: ");
        Numero = ingreso.nextInt();

        System.out.println("\nEl logaritmo base 10 de " +  Numero + " es " + Math.log10(Numero));
    }
}
