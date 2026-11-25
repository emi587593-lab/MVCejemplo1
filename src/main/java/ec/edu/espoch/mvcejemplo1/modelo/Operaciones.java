
package ec.edu.espoch.mvcejemplo1.modelo;


public class Operaciones implements InterfazOperaciones{
    public float sumar(Operacion operacion){
        
        return operacion.getNumUno() + operacion.getNumDos();
        
    }
    
}
