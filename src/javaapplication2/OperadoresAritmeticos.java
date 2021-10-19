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
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numeroDos=2;
        int numeroTres=3;
        int resultadoSuma=numeroDos+numeroTres;
        
        System.out.println("el resultado es :"+ resultadoSuma);
        
        int resulradoResta= numeroTres-numeroDos;
        
        int numeroDosConCambioDeSigno=-numeroDos;
        
        System.out.println("el negativo es: "+ numeroDosConCambioDeSigno);
        
        double resultadoMultiplicacion = numeroTres*3.5;
        
        double resultadoDivision = (double)numeroDos/numeroTres;
        System.err.println("el resultado de la division es:" + resultadoDivision);
        
        int resultadoModulo = numeroTres%numeroDos;
        System.err.println("el resto de dividir 3 entre 2 es:"+resultadoModulo);
        
    }
    
}
