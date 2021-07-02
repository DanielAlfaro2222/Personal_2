import java.util.Scanner;

public class EjemploOperadorTernario {
    
    public static void main(String[] args) {
        
        Scanner ingresar = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero: ");
        num = ingresar.nextInt();

        String respuesta = (num % 2 == 0) ? "El numero es par":"El numero es impar";

        System.out.println(respuesta);
    }
}