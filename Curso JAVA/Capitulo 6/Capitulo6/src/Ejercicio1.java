import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        System.out.println("Programa que recibe una edad y devuelve la mitad de edad de la persona");

        String edad = JOptionPane.showInputDialog("Ingrese su edad");

        int EdadConvertida = Integer.parseInt(edad);

        JOptionPane.showMessageDialog(null, "La mitad de su edad es: " + EdadConvertida / 2);
    }
}
