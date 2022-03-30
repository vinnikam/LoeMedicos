/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni@
 */
public class GestorPersistencia {
    private static final String archivo = "citas.vin";
    public static boolean guardar(Object dato){
        File file = new File(archivo);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dato);
            oos.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static Object recuperar(){
        File file = new File(archivo);
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object objeto = ois.readObject();
            return objeto;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
