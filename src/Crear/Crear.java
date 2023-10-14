/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crear;

/**
 *
 * @author PC
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Crear {
    
    private String rutaArchivo;

    public Crear(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void crearArchivo() {
        try {
            Path archivo = Paths.get(rutaArchivo);
            Files.createFile(archivo);
            System.out.println("Archivo creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Crear creador = new Crear("C:/Pruebas/archivo.txt");
        creador.crearArchivo();
    }
}
 
    
   
