public class Ejercicio12 {
    public static void main(String[] args) {
        
        System.out.println("Programa que genera tres numeros aleatorios entre 100 y 200");

        for (int i = 0; i < 3; i++) {
            System.out.println("Numero " + (i + 1) + ": " + Math.round(100 + (Math.random() * 100)));
        }
    }
}
