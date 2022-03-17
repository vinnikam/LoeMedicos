/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Cita;
import datos.OpcionCita;
import java.util.Calendar;
import java.util.Locale;
import logica.GestorCitas;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TP303
 */
public class CrearCitaTest {
    
    @Test
    public void crearPacienteNull(){
        GestorCitas gcita = new GestorCitas();
        Cita lacita = gcita.crearCita(null, null, null, null, null);
        assertNull(lacita);
    }
    @Test
    public void crearCitaPacienteNull(){
        GestorCitas gcita = new GestorCitas();
        Calendar c = Calendar.getInstance();
        Cita lacita = gcita.crearCita(null, null, null, c.getTime(), OpcionCita.PEDIATRIA);
        assertNull(lacita);
    }
    @Test
    public void crearCitaPacienteNotNull(){
        GestorCitas gcita = new GestorCitas();
        Calendar c = Calendar.getInstance();
        Cita lacita = gcita.crearCita("Julio", "752222", c.getTime(), c.getTime(), OpcionCita.PEDIATRIA);
        assertNotNull(lacita);
    }
    @Test
    public void crearCitaPacienteFechaNull(){
        GestorCitas gcita = new GestorCitas();
        Calendar c = Calendar.getInstance();
        Cita lacita = gcita.crearCita("Julio", "752222", null, c.getTime(), OpcionCita.PEDIATRIA);
        assertNull(lacita);
    }
    @Test
    public void crearCitaPacienteFechaCitaNull(){
        GestorCitas gcita = new GestorCitas();
        Calendar c = Calendar.getInstance();
        Cita lacita = gcita.crearCita("Julio", "752222",  c.getTime(),null, OpcionCita.PEDIATRIA);
        assertNull(lacita);
    }
    @Test
    public void crearCitaPacienteBlancoNull(){
        GestorCitas gcita = new GestorCitas();
        Calendar c = Calendar.getInstance();
        Cita lacita = gcita.crearCita("", "",  c.getTime(),c.getTime(), OpcionCita.PEDIATRIA);
        assertNull(lacita);
    }
}
