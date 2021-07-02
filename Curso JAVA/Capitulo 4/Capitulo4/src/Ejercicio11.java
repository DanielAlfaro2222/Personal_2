public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Programa que imprime tres numeros aleatorios entre 1 y 10 \n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Numero " + (i+1) + ": " + Math.round(1 + (Math.random() * 10)) );
        }
    }
}
