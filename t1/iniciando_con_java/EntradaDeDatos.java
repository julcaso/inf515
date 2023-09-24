import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {

        // Crea un objeto Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese su nombre
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicita al usuario que ingrese su edad
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Imprime los datos ingresados por el usuario
        System.out.println("Hola, " + nombre + ". Tu edad es " + edad + " años.");
    }
}
