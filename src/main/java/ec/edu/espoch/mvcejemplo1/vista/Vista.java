
package ec.edu.espoch.mvcejemplo1.vista;

import ec.edu.espoch.mvcejemplo1.controlador.ControlarOperaciones;


public class Vista {
    ControlarOperaciones controlador = new ControlarOperaciones();
    public String getNumOne(){
      return "5";  
    }
    public String getNumTwo(){
        return "6";
    }
    public void mostrar(float respuesta ){
           System.out.println("la respuesta es:"+respuesta);
    }
    public void mostrarError(){
        System.out.println("error..");
    }
    public void enviar(){
    controlador.controlarOperacion();
    }
}
