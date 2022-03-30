/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
public class Cita implements Serializable{
    private Paciente elPaciente;
    private OpcionCita opcion;
    private Date fecha;
    private String codigo;
    
    public Cita(Paciente elPaciente, Date fecha, OpcionCita opcion){
        this.elPaciente = elPaciente;
        this.fecha = fecha;
        this.opcion = opcion;
        this.codigo = elPaciente.obtenerIdentificacion()+fecha.getTime();
        
    }
    public Paciente obtenerPaciente(){
        return this.elPaciente;
    }
    public OpcionCita obtenerOpcion(){
        return this.opcion;
    }
    public Date obtenerFecha(){
        return this.fecha;
    }

    public String getCodigo() {
        return codigo;
    }
    
    @Override
    public String toString() {
        return " La cita codigo "+this.codigo+"\n es para "+elPaciente.obtenerNombre()+ "\n el dia "+this.fecha;
    }
    
}
