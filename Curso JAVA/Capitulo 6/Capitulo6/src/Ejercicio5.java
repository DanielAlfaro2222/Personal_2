import javax.swing.JOptionPane;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa que recibe la estatura de un usuario, y retorna la estatura que tuviera si midiera 10 cm mas");

        String estatura = JOptionPane.showInputDialog("Ingrese su estatura");

        int EstaturaConvertida = Integer.parseInt(estatura);

        JOptionPane.showMessageDialog(null, "Su estatura con 10 cm mas es: " + (EstaturaConvertida + 10) + " metros");
    }
}
