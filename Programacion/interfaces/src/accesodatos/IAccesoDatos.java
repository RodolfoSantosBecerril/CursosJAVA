package accesodatos;


public interface IAccesoDatos { //no es una clase y no extiende de object
    int MAX_REGISTRO=10; // inicializamos la variable, En interfaces deben ser constantes y con valor incial    
    //cualquier metodo es public y abstract
    void insertar(); //el compilador agrega public y abstrac    
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
 
    
}
