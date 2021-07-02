import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner ingresar = new Scanner(System.in);

        String Nombre;
        int Edad;

        System.out.println("Ingrese su nombre: ");
        Nombre = ingresar.nextLine();

        System.out.println("Ingrese su edad: ");
        Edad = ingresar.nextInt();

        System.out.println("Nombre: " + Nombre + " Edad: " + Edad + " años");
    }
}
