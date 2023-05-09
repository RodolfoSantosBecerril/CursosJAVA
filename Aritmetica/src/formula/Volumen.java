/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

/**
 *
 * @author black
 */
public class Volumen {
   int base=3;
   int alto=2;
   int largo=4;
   
    public Volumen(){
              int res =base*alto*largo;
             System.out.println("Ejecutando constructor= "+res);
    }
    
    
}
