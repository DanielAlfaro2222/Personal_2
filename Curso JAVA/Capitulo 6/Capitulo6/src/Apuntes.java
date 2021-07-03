public class Apuntes {
    public static void main(String[] args) throws Exception {      
      /*
            Tipos de metodos

            En java existen dos tipos de metodos, los metodos estaticos y los no estaticos:

            * Metodos estaticos => Este tipo de metodo, son los que para poder usarlos, se tienen que primero hacer referencia al nombre de la clase.Por ejemplo:

                Math.random();

            * Metodos no estaticos => Este tipo de metodo, son los que para poder usarlos, se tiene que primero hacer referencia al objeto que instanciamos de la clase.Por ejemplo:

                String cadena = "";
                cadena.length();
        */

        /*
            Clase Scanner

            La clase Scanner se usa cuando queremos realizar la interaccion con el usuario, por ejemplo para pedirle datos al usuario, para poder realizar esto, primero deberemos importar la libreria con todo lo concerniente a la clase Scanner, de la siguiente manera: 

                import java.util.Scanner;

            Una vez importada la libreria, lo siguiente que tendremos que hacer es, crear una instancia de la clase Scanner, llamando a su constructor y especificandole que los datos los va a leer por el teclado usando el System.in, de la siguiente manera:

                Scanner ingreso = new Scanner(System.in);

            Luego ya podremos mandarle mensajes al usuario sobre que es lo que deberia ingresar, y almacenar los datos en una variable, de la siguiente manera:

                System.out.println("Ingrese un numero: ");
                int num = ingreso.nextInt();

            Ahora, la clase Scanner lo que hace es convertir por defecto los datos ingresados por el usuario los tomara como un String o una cadena de caracteres, si nosotros necesitamos realizar un casting o manipular otro tipo de dato, ahi es donde entra la palabra reservada next, la cual basicamente realiza una conversion de tipos a lo que ingreso el usuario, si nosotros necesitamos manipular numeros enteros, tendremos que usar nextInt(), si necesitamos manipular un valor flotante o double, tendremos que usar nextDouble o nextFloat, etc.....Dependiendo el tipo de dato que necesitemos manipular usaremos alguno de los next existentes.
        */
    }
}
