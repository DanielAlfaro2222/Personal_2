import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que calcula la raiz cuadrada de un numero");

        int num = 0;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = ingresar.nextInt();

        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
}
