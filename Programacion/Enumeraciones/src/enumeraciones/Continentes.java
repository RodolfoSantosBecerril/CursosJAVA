/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author black
 */
public enum Continentes {
    Africa(53),
    Europa(46),
    Asia(44),
    America(34),
    Oceania(14);
    private final int paises;
     Continentes(int paises){
      this.paises=paises;
      
     }
     public int getPaises(){
         return this.paises;
         
     }
}
