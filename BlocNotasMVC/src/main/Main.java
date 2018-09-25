
package main;

import model.ModelBlocNotas;
import view.ViewBlocNotas;
import controller.ControllerBlocNotas;

public class Main {

   
    public static void main(String[] args) {
        ModelBlocNotas modelBlocNotas = new ModelBlocNotas();
        ViewBlocNotas viewBlocNotas = new ViewBlocNotas();
        ControllerBlocNotas controllerBlocNotas = new ControllerBlocNotas(modelBlocNotas, viewBlocNotas);
        
        
    }
    
}
