/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mypoo2.ejercicio2_11_act6;

/**
 *
 * @author HP-255-G10
 */
public class Ejercicio2_11_act6 {

    public static void main(String[] args) {

        String[] palabras = {
            "Física",
            "Espacio",
            "Tiempo"
        };

        articulo articulo = new articulo(
                "La teoría especial de la relatividad",
                "Albert Einstein",
                palabras,
                "Anales de Física",
                1913,
                "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales."
        );

        articulo.imprimirArticulo();

    }

}
