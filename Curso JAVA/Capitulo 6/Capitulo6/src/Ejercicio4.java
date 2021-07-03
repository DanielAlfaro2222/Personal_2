import javax.swing.JOptionPane;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa que recibe el nombre de una persona, y retorna solamente las dos primeras letras");

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        JOptionPane.showMessageDialog(null, "Dos primeras letras de su nombre: " + nombre.substring(0, 2));
    }
}
