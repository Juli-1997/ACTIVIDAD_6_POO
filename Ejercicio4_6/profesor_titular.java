/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mypoo2.ejercicio4_6_act6;

/**
 *
 * @author HP-255-G10
 */
public class profesor_titular extends profesor {

    // Cantidad de años como profesor titular
    int años = 0;

    // Sobrescribe el método de la clase padre
    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    // Método propio de la clase hija
    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }

}
