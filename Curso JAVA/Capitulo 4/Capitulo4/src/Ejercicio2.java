import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Programa que convierte grados a radianes");

        int Grados = 0;

        Scanner ingresar = new Scanner(System.in);

        System.out.println("\nIngrese el valor de los grados: ");
        Grados = ingresar.nextInt();

        System.out.println("\nResultado de la conversion de " + Grados + " grados a radianes " + Math.toRadians(Grados));

    }
}
