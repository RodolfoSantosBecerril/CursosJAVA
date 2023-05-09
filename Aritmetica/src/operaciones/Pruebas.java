/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author black
 */
public class Pruebas {
    public static void main(String[] args) {
        //definir variables locales
        int a= 10;
        int b= 2;
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:"+ aritmetica1.a);
        System.out.println("aritmetica1 b:"+ aritmetica1.b);
        
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);{
        System.out.println("aritmetica2 a:"+ aritmetica2.a);
        System.out.println("aritmetica2 b:"+ aritmetica2.b);
        }
       /** aritmetica1.a=3;
        aritmetica1.b=2;
        aritmetica1.sumar();
            int res = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde preuba= " + res);
        res = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos= "+ res);
        */
    }
    public static void otroMetodo(){
        System.out.println("mi metodo");
    
    
    
}
    
}
