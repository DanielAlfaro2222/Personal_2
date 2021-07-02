import java.util.Scanner;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que imprime la tabla de multiplicar de un numero");

        int num = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = ingreso.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + ": " + (num * i));
        }
    }
}
