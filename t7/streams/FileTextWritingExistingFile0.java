/*

FileTextWritingExistingFile0.java

Clases a usar:

java.util.Scanner
java.lang.Console
java.io.File
java.io.FileWriter
java.io.PrintWriter
java.io.IOException

*/

import java.io.*;
import java.util.*;

public class FileTextWritingExistingFile0{
    public static void main(String [] args){
        //File objetoFile = new File("texto0.txt");
        File objetoFile = new File(args[0]);
        boolean seleccion = true;
        Scanner leerTeclado = new Scanner(System.in);
        String opcionSeleccionada;

        try{
            
            System.out.println("Debug point: " + objetoFile.exists());

            if(objetoFile.exists()){
                System.out.print("\n\t=> El archivo " + objetoFile.getName() + 
                                 " ya existe, Usted quiere: \n" + 
                                 "\n\t *Sobreescribirlo...S" + 
                                 "\n\t * Agregar...A\n\n\t=> Su seleccion (S o A): ");
                
                opcionSeleccionada = leerTeclado.next();

                if (opcionSeleccionada.equals("S") || opcionSeleccionada.equals("s")){
                    seleccion = false;
                } 
            } else{
                System.out.println("\n\t=> El archivo " + objetoFile.getName() +
                                   " NO EXISTE, se procede a su creacion\n");
            }

            FileWriter objetoFileWriter = new FileWriter(objetoFile, seleccion);
            PrintWriter objetoPrintWriter = new PrintWriter(objetoFileWriter, true);

            Console console = System.console();
            String linea = console.readLine("\n\t => Entre el texto a escribir: \n\n");
            objetoPrintWriter.println(linea);
            objetoFileWriter.flush();
            objetoPrintWriter.close();
        } catch(IOException ioex){
            ioex.printStackTrace();
        }
    }
}
