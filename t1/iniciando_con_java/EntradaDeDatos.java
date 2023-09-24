/***************************************
Autor:    Julio Castro Ortiz.
Fecha:    24/9/2023.
Semestre: 2023-20.
Objetivo: Ejemplo docente.

Este programa es simple pero ilustra los conceptos básicos de la 
entrada de datos con Scanner. En primer lugar, crea un objeto Scanner 
para leer datos del teclado. Luego, utiliza el método nextLine() para
leer una  cadena de texto  del  usuario. Por último, utiliza el método 
nextInt() para leer un número entero del usuario.

Tema:     Iniciando con Java.
Materias: INF514, INF515.
****************************************/

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
