package logica;

import datos.Cita;
import datos.OpcionCita;
import datos.Paciente;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import utilidades.GestorPersistencia;

/**
 *
 * @author TP303
 */
public class GestorCitas {
    private Map<String, Cita> listaCitas;
    public GestorCitas(){
        if (listaCitas == null){
            listaCitas = (Map<String, Cita> )GestorPersistencia.recuperar();
            if (listaCitas == null){
                listaCitas = new HashMap<>();
            }
        }
    }
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
            Cita c = new Cita(elPaciente, fecha, opcion);
            //c.modificaElPaciente(elPaciente);
            //c.modificaFecha(fecha);
            //c.modificaOpcion(opcion);
            listaCitas.put(c.getCodigo(), c);
            GestorPersistencia.guardar(listaCitas);
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
    public Map<String, Cita> obtenerLista(){
        return this.listaCitas;
    }
}
