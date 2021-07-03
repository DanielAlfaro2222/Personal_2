import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Programa que recibe la edad de una persona y el programa retorna que edad tendra en 10 años");

        String edad = JOptionPane.showInputDialog("Ingrese su edad");
        int EdadConvertida = Integer.parseInt(edad);

        JOptionPane.showMessageDialog(null, "En 10 años su edad sera " + (EdadConvertida + 10));
    }
}
