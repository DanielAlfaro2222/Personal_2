import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa que convierte radianes a coseno");

        int Radianes = 0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("\nIngrese el valor de los radianes a convertir: ");
        Radianes = ingreso.nextInt();

        System.out.println("\nEl resultado de convertir " + Radianes + " radianes a coseno es " + Math.cos(Radianes));
    }
}
