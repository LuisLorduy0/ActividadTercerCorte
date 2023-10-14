/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escritura;

/**
 *
 * @author PC
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    private final String nombreArchivo;

    public Escritura(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void escribirEnArchivo(String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            System.err.println("Error de escritura en el archivo");
            e.printStackTrace(); // Esto imprime la traza de la excepción para ayudar en la depuración
        }
    }

    public static void main(String[] args) {
        Escritura escritor = new Escritura("C:/Pruebas/archivo.txt");
        escritor.escribirEnArchivo("holaaa");
    }
}

    
 
