import java.util.Scanner;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        System.out.println("Programa que redondea un numero decimal");

        double num = 0;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        num = ingresar.nextDouble();

        System.out.println("El numero " + num + " decimal redondeado es: " + Math.round(num));
    }
}
