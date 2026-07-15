/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mypoo2.ejercicio2_10_act6;

/**
 *
 * @author HP-255-G10
 */
public class Ejercicio2_10_act6 {

    public static void main(String[] args) {

        pedido pedido = new pedido();

        pedido.calcularPedido(
                "Sancocho",
                5000,
                "Gaseosa",
                2000);

        pedido.calcularPedido(
                "Crema de verduras",
                3000,
                "Churrasco",
                8000,
                "Gaseosa",
                2000);

        pedido.calcularPedido(
                "Crema de espinacas",
                4000,
                "Salmón",
                12000,
                "Gaseosa",
                2000,
                "Tiramisú",
                4000);

    }

}
