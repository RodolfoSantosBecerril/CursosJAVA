/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import javax.swing.JOptionPane;

/**
 *
 * @author black
 */
public class MetodoPrincipal {
    
    public static void main(String[] args) {
       int  num3=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
       int  num4=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
           
        Ejemplo op= new Ejemplo();
         
        int suma = op.sumar(num3,num4);
        int resta= op.restar(num3,num4 );
        int mult=  op.multiplicar( num3,num4);
        int div=  op.division(num3,num4 );
         op.mostrarRes(suma,resta, mult, div);
        
        System.out.println("Nuevamente la suma es: "+ op.sumar(num3, num4));
        System.out.println("Nuevamente la resta es: "+op.restar(num3, num4));
        System.out.println("Nuevamente la multiplicación es: "+op.multiplicar(num3, num4)); 
        System.out.println("NUevamente la division es: "+op.division(num3, num4));
     
    }
    
             
             
}