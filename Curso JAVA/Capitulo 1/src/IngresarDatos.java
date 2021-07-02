import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {
     
        Scanner ingresar = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("Ingrese el primer numero: ");
        num1 = ingresar.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = ingresar.nextInt();

        resultado = num1 + num2;

        System.out.println("El resultado de la suma es: " + resultado);
    }
}