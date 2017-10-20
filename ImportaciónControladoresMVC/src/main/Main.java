package main;

import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    
    public static void main (String oamg[]){
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
       // ControllerPrincipal controller_principal = new ControllerPrincipal(ModelPrincipal model_principal, view_block_notas);
        
        ModelBlockNotas model_block_notas = new ModelBlockNotas();
        ViewBlockNotas view_block_notas = new ViewBlockNotas();
        
        Object models[] = new Object[2];
        Object views[] = new Object[2];
        Object controllers[] = new Object[2];
        
        models[1] = model_block_notas;
        models[0] = model_principal;
        
        views[1] = view_block_notas;
        views[0] = view_principal;
        
        ControllerBlockNotas controller_block_notas = new ControllerBlockNotas(models, views);
        controllers[1] = controller_block_notas;
        ControllerPrincipal controller_principal = new ControllerPrincipal(models, views, controllers);
        controllers[0] = controller_principal;
    }
}