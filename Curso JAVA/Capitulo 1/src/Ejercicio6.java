import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner ingresar = new Scanner(System.in);

        String PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido;

        System.out.println("Ingrese su primer nombre: ");
        PrimerNombre = ingresar.nextLine();

        System.out.println("Ingrese su segundo nombre: ");
        SegundoNombre = ingresar.nextLine();

        System.out.println("Ingrese su primer apellido: ");
        PrimerApellido = ingresar.nextLine();

        System.out.println("Ingrese su segundo apellido: ");
        SegundoApellido = ingresar.nextLine();

        System.out.println("Primer Nombre: "+ PrimerNombre + "\n\nSegundo Nombre: " + SegundoNombre + "\n\nPrimer Apellido: " + PrimerApellido + "\n\nSegundo Apellido: " + SegundoApellido);
    }    
}
