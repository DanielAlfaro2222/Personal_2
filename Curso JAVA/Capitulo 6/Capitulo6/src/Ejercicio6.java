import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa que recibe el sueldo de una persona y retorna cuanto sera el sueldo del proximo año si aumenta un 10%");

        String sueldo = JOptionPane.showInputDialog("Ingrese su salario");

        int SueldoConvertido = Integer.parseInt(sueldo);

        JOptionPane.showMessageDialog(null, "Su salario aumentado un 10% es " + (SueldoConvertido + (SueldoConvertido * 0.1)));
    }
}
