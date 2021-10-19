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
public class AlcanceDeLasVariables {
    //aqui vienen las varaibles globales
    public static void main(String[] args) {
        int dias=0;
        //solo es accesible por el metodo main
        
        while(dias<30){
            dias=dias+1;
            int semanas=dias/7;
            System.out.println("han pasado"+dias+"dias lo que supones"+semanas+"semanas");
        }
        int años=dias/52;
    }
}
