/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lectura;

/**
 *
 * @author PC
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    

    private String nombreArchivo;

    public Lectura(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void leerArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            System.err.println("Error de lectura del archivo");
        }
    }

    public static void main(String[] args) {
        Lectura lector = new Lectura("C:/Pruebas/archivo.txt");
        lector.leerArchivo();
    }
}

