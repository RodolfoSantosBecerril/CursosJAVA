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
public class Ejemplo {
//    String color;
//    String marca;
//    int kilometros;  
//    int suma;
//    int resta;
//    int mult;
//    int div;
//    int num1;
//    int num2;
     public Ejemplo( ){
               
         
         
     }
//    public static void main(String[] args) {
//        byte entero=8; // declararción de variable
//        short var1=16;
//        double var2=64;
//        float var3=2.34f;
//        char caracter= 'a';
//        
//        System.out.println("Hola"+ " "+entero +" "+ var1 +" "+ var2+" "+ var3+" "+ caracter);
//        Ejemplo coche1= new Ejemplo();
//        coche1.color= "Rojo";
//        coche1.marca="Aveo";
//        coche1.kilometros=0;
//        System.out.println("El color es:"+coche1.color);
//        System.out.println("La marca es:"+coche1.marca);
//        System.out.println("Los Kilometros recorridos son:"+coche1.kilometros);
//        
//        Ejemplo coche2=new Ejemplo();
//        coche2.color="verde";
//        coche2.marca="Jeep";
//        coche2.kilometros=10;
//        System.out.println("El color es:"+coche1.color);
//        System.out.println("La marca es:"+coche1.marca);
//        System.out.println("Los Kilometros recorridos son:"+coche1.kilometros); 
//        //EL  resultado a imprimir tomará los valores de el primer metodo
//        //metodo para pedir numeros

   
         
 //       }
//    public void leerNumero(){
//            num1=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
//            num2=Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
//           
//    
//    }
    //metodo para sumar
    public int sumar(int num3, int num4){
     int  suma=num3+num4; 
     return suma;
    }
    public int restar(int num3, int num4){
      int   resta=num3-num4;
        return  resta;
    }
    public int multiplicar(int num3, int num4){
       int mult=num3*num4;
        return mult;
    }
    public int division(int num3, int num4){
       int div=num3/num4;
        return div;
    }
    
    public void mostrarRes(int suma, int resta, int mult, int div){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La division es: "+div);
    }
     
     
 
     
}
