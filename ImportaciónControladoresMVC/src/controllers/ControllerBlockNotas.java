package controllers;

import javax.swing.JOptionPane;
import models.ModelBlockNotas;
import views.ViewBlockNotas;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerBlockNotas {
    private final ModelBlockNotas model_block_notas;
    private final ViewBlockNotas view_block_notas;
    
    public ControllerBlockNotas(Object models[], Object views[]){
        model_block_notas = (ModelBlockNotas) models[1];
        view_block_notas = (ViewBlockNotas) views[1];
    }
    
    public void jmi_abrirMouseClicked(){
        model_block_notas.getFile_Chooser().showOpenDialog(view_block_notas);
        model_block_notas.Leer_Archivo();
        view_block_notas.jta_area_trabajo.setText(model_block_notas.getTexto());
    }
    
    public void jmi_guardarMouseClicked(){
       model_block_notas.setTexto(view_block_notas.jta_area_trabajo.getText());
       model_block_notas.Guardar_Archivo();
    }
    
    public void jmi_salirMouseClicked(){
                System.exit(0);
    }
}