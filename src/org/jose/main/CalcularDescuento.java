/**
 *
 *  Fecha de crecion:
 *      03/08/2024
 *  Fecha de edicion:
 *      03/08/2024
 * 
 * @author garci
 * 
 */

// package de Netbeans
package org.jose.main;

//Libreria de Java
import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto:");
        double precio = lector.nextDouble();
        double descuento = 0.0;
        
        
        if (precio >= 20 && precio <= 70){
            descuento = 0.01;
        }else if (precio >= 71 && precio <=80){
            descuento = 0.012;
        }else if (precio >= 81 && precio <= 90){
            descuento = 0.0125;
        }else if (precio >= 91 && precio <= 100){
            descuento = 0.0145;
        }else{
            System.out.print("No hay descuento para ese precio.");
            lector.close();
            return;
        }
        
        //Doble para los decimales
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;
        
        //Se ponen 2 decimales Q0.00
        System.out.printf("El descuento es: Q%.2f%n", montoDescuento);
        System.out.printf("El precio final despues del descuento es: Q%.2f%n", precioFinal);
        
        lector.close();
    }
}

