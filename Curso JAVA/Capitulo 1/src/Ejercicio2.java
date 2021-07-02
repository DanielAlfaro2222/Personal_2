import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        int edad = 0;

        System.out.println("Ingrese su edad: ");
        edad = ingreso.nextInt();

        System.out.println("Su edad es " + edad + " años");
    }
}
