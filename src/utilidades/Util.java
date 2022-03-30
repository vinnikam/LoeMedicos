/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vinni@
 */
public class Util {
    public static String convertirDateString(Date fecha){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        if (fecha == null){
            return sd.format(new Date());
        }else{
            return sd.format(fecha);
        }
        
    }
    
}
