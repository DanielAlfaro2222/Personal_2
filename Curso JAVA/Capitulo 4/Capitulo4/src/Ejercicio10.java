public class Ejercicio10 {
    public static void main(String[] args) {

        System.out.println("Programa que imprime tres numeros aleatorios entre 0.0 y 1");

        for (int i = 0; i < 3; i++) {
            System.out.println("Numero " + (i + 1) + ": " + Math.random());
        }
    }    
}
