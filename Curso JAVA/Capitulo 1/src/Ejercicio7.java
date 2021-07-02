import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        String Nombre = "";

        System.out.println("Ingrese su nombre: ");
        Nombre = ingresar.nextLine();

        System.out.println();

        for(int i = 0; i < Nombre.length(); i++){
            System.out.println(Nombre.charAt(i));
        }
    }
}
