import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Programa que convierte radianes a grados");

        int Radianes = 0;

        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese el valor de los radianes: ");
        Radianes = ingresar.nextInt();

        System.out.println("Resultado de convertir " + Radianes + " radianes a grados: " + Math.toDegrees(Radianes));
    }
}
