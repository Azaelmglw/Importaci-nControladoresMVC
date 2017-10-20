package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Azael_Mendoza
 */
public class ModelBlockNotas {
    private FileWriter file_writter;
    private FileReader file_reader;
    private JFileChooser file_chooser = new JFileChooser();
    
    File archivo;
    String texto = "t";
    
    public String getTexto() {
        return texto;
    }
    
    public JFileChooser getFile_Chooser(){
        return file_chooser;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void Leer_Archivo() {
        try {
            archivo = (file_chooser.getSelectedFile());
            file_reader = new FileReader(archivo);
            int character = 0;
            String content = "";
            while ((character = file_reader.read()) != -1) {
                content += (char) character;
            }
            file_reader.close();
            System.out.println(content);
            texto = content;
        }catch(NullPointerException a){
            //
        } catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado");
        } catch (IOException err) {
            System.err.println("Error en el archivo");
        } finally {
            try {
                file_reader.close();
            } catch (IOException err) {
                System.err.println("Error al cerrar");
            }
        }
    } 

    public void Guardar_Archivo() {
        try {
            file_writter = new FileWriter(archivo, false);
            file_writter.write(texto);
            file_writter.close();

        } catch (FileNotFoundException err) {
            System.err.println("Archivo no Encontrado");
        } catch (IOException err) {
            System.err.println("Error en el archivo");
        }
    }    
}