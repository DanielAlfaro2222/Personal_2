import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que calcule la raiz cubica de un numero");

        int num = 0;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = ingresar.nextInt();

        System.out.println("La raiz cubica de " + num + " es: " + Math.cbrt(num));
    }
}
