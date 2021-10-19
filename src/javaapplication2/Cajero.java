/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class Cajero {
    public static void main(String[] args) {
        System.out.println("Elija uns de las siguientes opciones:");
        System.out.println("Escriba 1 para consultar su saldo");
        System.out.println("Escriba 2 para ingresar dinero");
        System.out.println("Escriba 3 para sacar dinero");
        System.out.println("Escriba 4 para consultar sus ultimos movimientos");
        
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada= scanner.nextInt();
        
        System.err.println("La opcion que usted ha elegido es:"+ opcionSeleccionada);
    }
    
}
