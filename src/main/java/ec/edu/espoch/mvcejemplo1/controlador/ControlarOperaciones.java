package ec.edu.espoch.mvcejemplo1.controlador;

import ec.edu.espoch.mvcejemplo1.modelo.Operacion;
import ec.edu.espoch.mvcejemplo1.modelo.Operaciones;
import ec.edu.espoch.mvcejemplo1.modelo.InterfazOperaciones;
import ec.edu.espoch.mvcejemplo1.vista.Vista;

public class ControlarOperaciones {

    public void controlarOperacion() {
        Vista vista= new Vista();
        try {
            float numUno= Float.parseFloat(vista.getNumOne());
            float numDos=Float.parseFloat(vista.getNumTwo());
            Operacion operacion= new Operacion(numUno,numDos);
            InterfazOperaciones interfazOperacion = new Operaciones();
            float respuesta= interfazOperacion.sumar(operacion);
           
            vista.mostrar(respuesta);
        } catch (Exception e) {
            vista.mostrarError();

        }

    }
}  
