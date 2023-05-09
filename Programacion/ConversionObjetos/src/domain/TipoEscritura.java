/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author black
 */
public   enum TipoEscritura {  //Tipo enum para enumerar 
   CLASICO("Escritura a mano"),  //Enumerar variables
   MODERNO("Escritura Digital");
  private final String descripcion;  //variables que no se puede cambiar 
  private TipoEscritura(String descripcion){ //Constructor
      this.descripcion=descripcion; //inicializacion de variable
  }
  public String getDescripcion(){   //metodo set para descripcion  set no puede ser ya que se definio como final
      return this.descripcion;
      
  }
}
