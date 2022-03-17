/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Date;

/**
 *
 * @author 
 */
public class Cita {
    private Paciente elPaciente;
    private OpcionCita opcion;
    private Date fecha;
    
    public Paciente obtenerPaciente(){
        return this.elPaciente;
    }
    public void modificaElPaciente(Paciente elPaciente){
        this.elPaciente = elPaciente;
    }
    public OpcionCita obtenerOpcion(){
        return this.opcion;
    }
    public void modificaOpcion(OpcionCita opcion){
        this.opcion = opcion;
    }
    public Date obtenerFecha(){
        return this.fecha;
    }
    public void modificaFecha(Date fecha){
        this.fecha= fecha;
    }

    @Override
    public String toString() {
        return " La cita es para "+elPaciente.obtenerNombre()+ " el dia "+this.fecha;
    }
    
}
