import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        System.out.println("Programa que convierte radianes a su equivalente a tangente usando la siguiente formula");

        System.out.println("\ntan(x) = seno(x) / coseno(x)");

        int Radianes = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("\nIngrese el valor de los radianes a convertir: ");
        Radianes = ingreso.nextInt();

        double Formula = Math.sin(Radianes)/Math.cos(Radianes);

        System.out.println("\nResultado de pasar " + Radianes + " radianes a tangente, usando la anterior formula " + Formula);

    }
}
