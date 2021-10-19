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
public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("false & false es: "+(false&false));
        System.out.println("true & false es: "+(true&false));
        System.out.println("false & true es: "+(false&true));
        System.err.println("true & true es: "+(true&true));
        
        System.err.println("false && false es: "+(false&&false));
        System.err.println("true && false es: "+(true&&false));
        System.err.println("false && true es: "+(false&&true));
        System.err.println("true && true es: "+(true&&true));
        
        System.err.println("false | false es: "+(false|false));
        System.err.println("true | false es: "+(true|false));
        System.err.println("false | true es: "+(false|true));
        System.err.println("true | true es: "+(true|true));
        
        System.err.println("false ^ false es: "+(false^false));
        System.err.println("true ^ false es: "+(true^false));
        System.err.println("false ^ true es: "+(false^true));
        System.err.println("true ^ true es: "+(true^true));
        
        System.out.println("!faslse es"+!false);
    }
}
