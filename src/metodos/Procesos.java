/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Procesos {
    public Procesos(){
        sumarNumeros();
        restarNumeros(4,2,"operacion");
        String resultado=multiplicar();
        JOptionPane.showMessageDialog(null, resultado);
        String nombre="juan ariel";
        String respuesta=saludar(nombre);
        JOptionPane.showMessageDialog(null, respuesta);
    }
    
    //metodo sin retorno y sin parametos
    public void sumarNumeros(){
        JOptionPane.showMessageDialog(null, "metodo sin retorno y sin parametros");
        int x=5;
        int y=4;
        int suma = x+y;
        
        System.out.println("suma: "+suma);
    
    }
//metodo sin retorno y con parametros
    public void restarNumeros(int a, int b, String operta){
    JOptionPane.showMessageDialog(null, "metodo sin retorno y con parametros");    
    JOptionPane.showMessageDialog(null, "los valores que llegan son:"+a +" "+b+" "+operta);
    
    }
    //metodos con retorno y sin parametros

    public String multiplicar() {
        int x=1;
        int y=2;
        int multipliacion=x*y;
        
        return "la multiplicacion es: "+multipliacion;
    }
    //metodo con retorno y con parametros

    private String saludar( String nombre) {
        return "hola su nombre es :"+ nombre;
        
    }
    
    
    
    
}
