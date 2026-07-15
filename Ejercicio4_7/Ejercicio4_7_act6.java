/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mypoo2.ejercicio4_7_act6;

/**
 *
 * @author HP-255-G10
 */
public class Ejercicio4_7_act6 {

    public static void main(String[] args) {

        animal animales[] = new animal[4];

        animales[0] = new Perro();
        animales[1] = new Lobo();
        animales[2] = new Leon();
        animales[3] = new gato();

        for (animal animal : animales) {

            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();

        }

    }

}