/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eliminar;

/**
 *
 * @author PC
 */
import java.io.File;


public class Eliminar {
 
   
    private String rutaArchivo;

    // Constructor que recibe la ruta del archivo
    public Eliminar(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Método para eliminar el archivo
    public void eliminar() {
        try {
            // Crea una instancia de File con la ruta del archivo
            File archivo = new File(rutaArchivo);

            // Verifica si el archivo existe antes de intentar eliminarlo
            if (archivo.exists()) {
                if (archivo.delete()) {
                    System.out.println("Archivo borrado con éxito.");
                } else {
                    System.out.println("No se pudo borrar el archivo.");
                }
            } else {
                System.out.println("El archivo no existe en la ruta especificada.");
            }
        } catch (Exception e) {
            // Maneja la excepción de manera adecuada
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Especifica la ruta del archivo que deseas eliminar
        String rutaArchivo = "C:/Pruebas/archivo.txt";

        // Crea una instancia de EliminarArchivo
        Eliminar eliminador = new Eliminar(rutaArchivo);

        // Llama al método eliminar para eliminar el archivo
        eliminador.eliminar();
    }
}
 
 
