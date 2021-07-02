import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("Programa que convierte radianes a su equivalente en Seno");

        int Radianes = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("\nIngrese el valor de los radianes a convertir: ");
        Radianes = ingreso.nextInt();

        System.out.println("\nResultado de la conversion de " + Radianes + " grados a Seno " + Math.sin(Radianes));
    }
}
