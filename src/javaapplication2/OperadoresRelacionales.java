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
public class OperadoresRelacionales {
    public static void main(String[] args) {
        boolean esUnoMayorQueDos=1>2;
        System.err.println("es cierto que 1 es mayor que 2? "+esUnoMayorQueDos);
        
        boolean esUnoComaCincoMenorQueSieteComaDos=1.5<7.2;

        boolean esOcho=8>=8;
        
        System.err.println("8 es mayor o igual que ocho?"+esOcho);
        
        boolean esCuatroDiferenteDeCuatro=4!=4;
        System.err.println("es diferente 4 de 4 ?"+esCuatroDiferenteDeCuatro);
    }
}
