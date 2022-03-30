/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author TP303
 */
public class Paciente implements Serializable{
    private String nombre;
    private String identificacion;
    private Date fechaNac; 
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerIdentificacion(){
        return this.identificacion;
    }
    public Date obtenerFechaNac(){
        return this.fechaNac;
    }
    public void modificaNombre(String nombre){
        this.nombre = nombre;
    }
    public void modificaIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void modificaFechaNac(Date fechaNac){
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Paciente "+this.nombre+ " con identificacion "+this.identificacion;
    }
    
    public Integer obtenerEdad(){
        Integer edad = null;
        if (this.fechaNac != null){
            Calendar hoy= Calendar.getInstance();
            
            Calendar fechaNacC= Calendar.getInstance();
            fechaNacC.setTime(this.fechaNac);
            
            if (fechaNacC.before(hoy)){
                long edadEnDias = (hoy.getTimeInMillis() - fechaNacC.getTimeInMillis())
                        / 1000 / 60 / 60 / 24;

                edad = Double.valueOf(edadEnDias / 365.25d).intValue();
                return edad;
            }
            
        }
        return edad;
        
    }
    
}
