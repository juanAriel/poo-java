/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Conversor {
    public static void main(String[] args) {
        System.out.println("bienvenido al conversor de moneda");
        System.out.println("por favor introduce una cantidad en euros y el programa le devolvera");
        
        Scanner scanner =new Scanner(System.in);
        double euros=scanner.nextInt();
        
        double dolares=1.09*euros;
        
        System.out.println(euros+"equivale a: " + dolares+"us dolares");
        
        String eurosString=Double.toString(euros);
        BigDecimal eurosBigDecima= new BigDecimal(eurosString);
        double tasaDeCambio =1.09;
        String tasaDeCambioString= Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal=new BigDecimal(tasaDeCambioString);
        
        BigDecimal dolaresBigDecimal= eurosBigDecima.multiply(tasaDeCambioBigDecimal);
        
        System.out.println(euros+"euros equivalen a "+ dolaresBigDecimal.toString()+"us dolares");
    }
    
}
