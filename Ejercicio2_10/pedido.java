/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mypoo2.ejercicio2_10_act6;

/**
 *
 * @author HP-255-G10
 */
public class pedido {

    // Primer plato y bebida
    public void calcularPedido(String primerPlato, double valorPrimerPlato,
                               String bebida, double valorBebida) {

        double total = valorPrimerPlato + valorBebida;

        System.out.println("El costo de " + primerPlato + " y "
                + bebida + " es = $" + total);
    }

    // Primer plato, segundo plato y bebida
    public void calcularPedido(String primerPlato, double valorPrimerPlato,
                               String segundoPlato, double valorSegundoPlato,
                               String bebida, double valorBebida) {

        double total = valorPrimerPlato + valorSegundoPlato + valorBebida;

        System.out.println("El costo de " + primerPlato + " + "
                + segundoPlato + " + "
                + bebida + " es = $" + total);
    }

    // Primer plato, segundo plato, bebida y postre
    public void calcularPedido(String primerPlato, double valorPrimerPlato,
                               String segundoPlato, double valorSegundoPlato,
                               String bebida, double valorBebida,
                               String postre, double valorPostre) {

        double total = valorPrimerPlato
                + valorSegundoPlato
                + valorBebida
                + valorPostre;

        System.out.println("El costo de " + primerPlato + " + "
                + segundoPlato + " + "
                + bebida + " + "
                + postre + " es = $" + total);
    }

}
