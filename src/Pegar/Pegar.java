/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pegar;

/**
 *
 * @author PC
 */
import java.io.IOException;
import java.nio.file.*;


public class Pegar {
   
   
    private Path archivoOrigen;
    private Path archivoDestino;

    public Pegar(Path archivoOrigen, Path archivoDestino) {
        this.archivoOrigen = archivoOrigen;
        this.archivoDestino = archivoDestino;
    }

    public void copiarArchivo() {
        try {
            // Copia el archivo desde la ruta de origen a la de destino
            Files.copy(archivoOrigen, archivoDestino);
            System.out.println("Archivo copiado con éxito desde " + archivoOrigen + " a " + archivoDestino);
        } catch (IOException e) {
            // Maneja la excepción de manera adecuada
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Especifica las rutas de origen y destino
        Path archivoOrigen = Paths.get("C:/Pruebas/archivo.txt");
        Path archivoDestino = Paths.get("C:/Destino/archivo_copiado.txt");

        // Crea una instancia del objeto CopiadorArchivos
        Pegar copiador = new Pegar(archivoOrigen, archivoDestino);

        // Llama al método para copiar el archivo
        copiador.copiarArchivo();
    }
}
