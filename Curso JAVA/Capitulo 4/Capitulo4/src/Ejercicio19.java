import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe dos numeros, y realiza calculos basicos");

        int num1 = 0;
        int num2 = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = ingreso.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = ingreso.nextInt();

        System.out.println("Resultado suma: " + (num1 + num2));
        System.out.println("Resultado resta: " + (num1 - num2));
        System.out.println("Resultado multiplicacion: " + (num1 * num2));
        System.out.println("Resultado division: " + (num1 / num2));
    }
}
