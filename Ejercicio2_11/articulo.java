/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mypoo2.ejercicio2_11_act6;

/**
 *
 * @author HP-255-G10
 */
public class articulo {


    private String nombreArticulo;
    private String autor;
    private String[] palabrasClaves;
    private String nombrePublicacion;
    private int anio;
    private String resumen;

    // Constructor 1
    public articulo(String nombreArticulo, String autor) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }

    // Constructor 2
    public articulo(String nombreArticulo, String autor,
                              String[] palabrasClaves,
                              String nombrePublicacion,
                              int anio) {

        this(nombreArticulo, autor);

        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion = nombrePublicacion;
        this.anio = anio;
    }

    // Constructor 3
    public articulo(String nombreArticulo, String autor,
                              String[] palabrasClaves,
                              String nombrePublicacion,
                              int anio,
                              String resumen) {

        this(nombreArticulo, autor, palabrasClaves,
                nombrePublicacion, anio);

        this.resumen = resumen;
    }

    // Método para imprimir los datos
    public void imprimirArticulo() {

    System.out.println("Título del artículo = " + nombreArticulo);
    System.out.println("Autor del artículo = " + autor);

    System.out.println("Palabras clave =");

    if (palabrasClaves != null) {
        for (String palabra : palabrasClaves) {
            System.out.println(palabra);
        }
    }

    System.out.println("Publicación = " + nombrePublicacion);
    System.out.println("Año = " + anio);
    System.out.println("Resumen = " + resumen);

}
}
