import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe un numero, y retornar el resultado de sumar el numero mas el valor de Pi");

        int num = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = ingreso.nextInt();

        System.out.println("El resultado es: " + (num + Math.PI));
    }
}
