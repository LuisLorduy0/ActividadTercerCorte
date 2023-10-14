/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mover;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Mover {

    private String rutaOrigen;
    private String rutaDestino;

    // Constructor que recibe las rutas de origen y destino
    public Mover(String rutaOrigen, String rutaDestino) {
        this.rutaOrigen = rutaOrigen;
        this.rutaDestino = rutaDestino;
    }

    // Método para mover el archivo
    public void mover() {
        try {
            // Crea instancias de Path para las rutas de origen y destino
            Path origenPath = new File(rutaOrigen).toPath();
            Path destinoPath = new File(rutaDestino).toPath();

            // Mueve el archivo utilizando Files.move con StandardCopyOption.REPLACE_EXISTING
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Archivo movido con éxito.");
        } catch (IOException e) {
            // Maneja la excepción de manera adecuada
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Especifica la ruta del archivo de origen y destino
        String rutaOrigen = "C:/Pruebas/archivo.txt";
        String rutaDestino = "C:/Destino/archivo.txt";

        // Crea una instancia de MoverArchivo
        Mover movedor = new Mover(rutaOrigen, rutaDestino);

        // Llama al método mover para mover el archivo
        movedor.mover();
    }
}

