
package operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    //metodo
    public Aritmetica(int a, int b){
        this.a= a;
        this.b= b;
        System.out.println("Ejecutando constructor con argumentos");
        
    }
    public void sumar(){
        int res= a + b;
        System.out.println("res"+res);
    }
    
    public int sumarConRetorno(){
        
        return this.a+this.b;
        
    }
    public int sumarConArgumentos(int a, int b){
        this.a= a;
        this.b= b;
        //return a+b;
      return this.sumarConRetorno();
    }
}
