import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {

       Scanner ingreso = new Scanner(System.in);

       String nombre = "";

       System.out.println("Ingrese su nombre completo: ");
       nombre = ingreso.nextLine();

       System.out.println("Su nombre completo es " + nombre);
   } 
}
