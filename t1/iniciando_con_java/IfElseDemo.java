/***************************************
Autor:    Profesor Julio Castro Ortiz.
Fecha:    12/2/2022.
Semestre: 2022-10.
Objetivo: Ejemplo docente.

Programa con fines didácticos, tomado de la pagina del tutorial de 
java de Oracle y modificado por el profesor Julio Castro para
incluir la entrada por teclado. Tiene como objetivo mostrar el ciclo
de vida de un primer programa Java. Acepta una calificación y muestra
su equivalencia en el score obtenido en la escala A..F.

Fuente: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

Tema:     Iniciando con Java.
Materias: INF514, INF515.
****************************************/

import java.util.Scanner;

class IfElseDemo {  //Notación camellada de clases.
    public static void main(String [] args){

        int testScore; //destacar notacion camellada de identificadores.
        char grade;
        
        // clase Scanner para entrada de datos. //
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre su nota:");
        testScore = sc.nextInt();
        
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
