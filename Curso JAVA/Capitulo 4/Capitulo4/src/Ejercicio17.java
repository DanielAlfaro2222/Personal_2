import java.util.Scanner;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe la edad de un usuario y imprime la mitad de la edad");

        int edad = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        edad = ingreso.nextInt();

        System.out.println("Su edad es " + edad + " años y la mitad de su edad es " + (edad / 2) + " años");
    }
}
