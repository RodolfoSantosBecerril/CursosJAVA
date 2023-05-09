/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author black
 */
public class CicloFor {
    public static void main(String[] args) {
        double Ty=248;
        double Ts=86;
        double deltaTemp=0;
        double res=0;
        
        for (int i=0; i<=50; i++){
            res= Ty-Ts/49;
            System.out.println("numero: "+ res);
        }
        
     System.out.println("fin de ciclo");
        
    }
}
