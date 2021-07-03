import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa que recibe el nombre y el apellido de una persona, y retorna un saludo de bienvenida");

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");

        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + " " + apellido);
    }
}