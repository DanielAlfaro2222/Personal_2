import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {

        System.out.println("Programa que recibe la edad de cuatro personas y retorna el total de la suma de las cuatro edades");

        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;
        int edad4 = 0;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese la edad de la primer persona: ");
        edad1 = ingreso.nextInt();

        System.out.println("Ingrese la edad de la segunda persona: ");
        edad2 = ingreso.nextInt();

        System.out.println("Ingrese la edad de la tercer persona: ");
        edad3 = ingreso.nextInt();

        System.out.println("Ingrese la edad de la cuarta persona: ");
        edad4 = ingreso.nextInt();

        int resultado = edad1 + edad2 + edad3 + edad4;

        System.out.println("\nEl resultado de la suma de las cuatro edades es: " + resultado);
    }
}
