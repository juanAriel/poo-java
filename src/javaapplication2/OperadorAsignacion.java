/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ariel
 */
public class OperadorAsignacion {
    public static void main(String[] args) {
        int variable;
        variable=3;
        int variable2;
        variable2=8*9+95;
        
        int a,b,c;
        a=b=c=8;
        
        System.out.println("que valos tiene c =8?"+(c=8));
        
        
        int x = 10;
        x=x+3;
        
        System.out.println("el valor de la varaible x es: "+x );
        
        int y =10;
        
        y+=3;
        
        System.out.println("el valor de la variable y es: "+y);
    }
}
