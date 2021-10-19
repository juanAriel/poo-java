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
public class Literales {
    public static void main(String[] args) {
        int enteroDecimal=100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;
        
        System.err.println("enteroHexadecimal es :" + enteroHexadecimal);
        
        long numeroLong = 100L;
        
        double numeroDouble=2.5;
        
        float numeroFloat=2.5f;
        
        int numeroConGuiones=25_258_236;
        
        System.out.println("el numero  numeroConGuiones es :"+ numeroConGuiones);
        
        char miChar ='b';
        
        char miOtroChar='\u0062';
        
        System.err.println("el caracter miOtroChar es : "+ miOtroChar);
        
        char comillaSimple = '\'';
        
        String stringLiteral = "esto es un literal";
        
        boolean booleanNoVerdadero=true;
        
        String stringNulo=null;
        
    }
}
