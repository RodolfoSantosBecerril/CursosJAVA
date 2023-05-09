/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabraThis;

/**
 *
 * @author black
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona= new Persona("Rodolfo", "Santos");
        System.out.println("persona:"+persona);
        System.out.println("persona:"+persona.nombre);
        System.out.println("persona:"+persona.apellido);
    }

}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super();  constructor  llamada implicita al contructor a la clase padre(object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this"+this);
        new Imprimir().imprimir(this);
        

    }
    class Imprimir{
        public Imprimir(){
            super();//se manda a llamar el constructor de la clase object padre para reservar memoria
        }
        public void imprimir(Persona persona){
            System.out.println("persona desde imprimir: "+persona);
            System.out.println("Impresion de la persona actual this"+this);
        }
    }
}
