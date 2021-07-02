import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que recibe un numero y retorna el numero a la potencia de 4");

        int Num = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("\nIngrese un numero: ");
        Num = ingreso.nextInt();

        System.out.println("\nEl resultado de aplicar la potencia de 4 a " + Num + " es " + Math.pow(Num,4));
    }
}
