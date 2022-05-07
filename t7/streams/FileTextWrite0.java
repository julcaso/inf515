import java.io.File;

import java.io.*;

public class FileTextWrite0{
    public static void main (String [] args){
        try{
            File objetoFile = new File("archivoTexto0.txt");
            
            //Esta linea crea el archivo si no existe.
            boolean exito = objetoFile.createNewFile();

            if (exito){
                //Creo un objeto escritor de archivo.
                FileWriter objetoWriter = new FileWriter(objetoFile);
                //Escribir algunos registros en el archivo.
                objetoWriter.write("\n Esto es un ejemplo de archivo de texto.");
                objetoWriter.write("\n Esta es otra linea de ejemplo de un archivo de texto.");
                objetoWriter.close();
                System.out.println("\n Archivo creado exitosamente.");
            } else {
                System.out.println("\n El archivo ya existe.");
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}






