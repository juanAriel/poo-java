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
//estado tiene caractaristicas del objeto
//comportamiento opciones  que el objeto  realiza
//identidad lo que lo hace unico o diferente
public class Principal {
    
    public static void main(String[] args) {
        //creamos un objeto de la otra clase
        Procesos misProcesos=new Procesos();//esto es la instancia de la clase
        //utilizamos el objeto llamando al metodo que queremos usar
        misProcesos.sumar();//accediendo alos metodos
        misProcesos.restar();
        
    }
}
