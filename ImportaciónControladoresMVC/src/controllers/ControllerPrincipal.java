package controllers;

import models.ModelPrincipal;
import models.ModelBlockNotas;
import views.ViewPrincipal;
import views.ViewBlockNotas;
/**
 *
 * @author Azael_Mendoza
 */
public class ControllerPrincipal {
    private final ModelPrincipal model_principal;
    private final ViewPrincipal view_principal;
    private final ViewBlockNotas view_block_notas;
    private  ControllerBlockNotas controller_block_notas;
    
    public ControllerPrincipal(Object models[], Object views[], Object controllers[]){
        model_principal = (ModelPrincipal) models[0];
        view_principal = (ViewPrincipal) views[0];
        view_block_notas = (ViewBlockNotas) views[1];
        controller_block_notas = (ControllerBlockNotas) controllers[1];
        
        view_principal.jmi_block_notas.addActionListener(e -> jmi_block_notasMouseClicked());
        view_principal.jmi_abrir.addActionListener(e -> jmi_abrirMouseClicked());
        view_principal.jmi_guardar.addActionListener(e -> jmi_guardarMouseClicked());
        view_principal.jmi_salir.addActionListener(e -> jmi_salirMouseClicked());
        initView();
    }
    
    public void initView(){
        view_principal.jmi_abrir.setVisible(false);
        view_principal.jmi_guardar.setVisible(false);
        view_principal.setTitle("Importación Controladores MVC");
        view_principal.setLocationRelativeTo(null);
        view_principal.setVisible(true);
    }
    
    public void jmi_block_notasMouseClicked(){
        view_principal.jmi_block_notas.setVisible(false);
        view_principal.jmi_abrir.setVisible(true);
        view_principal.jmi_guardar.setVisible(true);
        view_principal.setContentPane(view_block_notas);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void jmi_abrirMouseClicked(){
        controller_block_notas.jmi_abrirMouseClicked();
    }
    
    public void jmi_guardarMouseClicked(){
        controller_block_notas.jmi_guardarMouseClicked();
    }
    
    public void jmi_salirMouseClicked(){
        controller_block_notas.jmi_salirMouseClicked();
    }
    
}