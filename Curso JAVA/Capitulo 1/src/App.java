public class App {

    public static String ImprimirNombre(String nombre){
        String mensaje = "Hola " + nombre;
        return mensaje;
    }
    public static void main(String[] args){
        String nombre = "Daniel";

        System.out.println(ImprimirNombre(nombre));
    }
}