package paquete1;

public class Clase1 {
//    public String atributoPublico   = "valor atributo publico";
//    public Clase1(){
//        System.out.println("Constructor publico  "   );
//    }
//    public void metodoPublico(){
//        System.out.println("metodo publico");
//         
//    }
    protected String atributoProtected   = "valor atributo protected";
    protected  Clase1(){
        System.out.println("Constructor protected  "   );
    }
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    protected void metodoProtected(){
        System.out.println("metodo protected");
         
    }
}
