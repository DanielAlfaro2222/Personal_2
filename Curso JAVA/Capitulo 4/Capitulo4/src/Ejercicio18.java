import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe el nombre y la edad de un usuario, el programa retorna el nombre y tabulado la edad");

        int edad = 0;
        String nombre = "";

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = ingreso.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = ingreso.nextInt();

        System.out.println("Su nombre es " + nombre + " y su edad es \t" + edad + " años");
    }
}
