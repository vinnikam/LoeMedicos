package logica;

import datos.Cita;
import datos.OpcionCita;
import datos.Paciente;
import java.util.Date;

/**
 *
 * @author TP303
 */
public class GestorCitas {
//    public Cita crearCita(Paciente elpac, Date fecha, OpcionCita opcion){
//        return null;
//    }
//    public Cita crearCita(Paciente elPaciente,Date fecha, OpcionCita opcion){
//        return null;
//    }
    public Cita crearCita(String nombre, String identificacion, Date fechaNac, 
            Date fecha, OpcionCita opcion){
        if (nombre == null || identificacion == null || fechaNac == null || fecha == null || opcion == null
                || nombre.isEmpty() || identificacion.isEmpty()){
            return null;
        }else{
            Paciente elPaciente = this.crearPaciente(nombre, identificacion, fechaNac);
            Cita c = new Cita();
            c.modificaElPaciente(elPaciente);
            c.modificaFecha(fecha);
            c.modificaOpcion(opcion);
            return c;
        }
        
        
    }
    private Paciente crearPaciente(String nombre, String identificacion, Date fechaNac){
        Paciente p = new Paciente();
        p.modificaFechaNac(fechaNac);
        p.modificaIdentificacion(identificacion);
        p.modificaNombre(nombre);
        return p;
    }
}
