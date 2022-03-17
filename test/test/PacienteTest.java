/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Paciente;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinni
 */
public class PacienteTest {
    
    public PacienteTest() {
    }
    @Test
    public void obtenerEdadNull(){
        Paciente p = new Paciente();
        Integer edad  = p.obtenerEdad();
        assertNull(edad);
        
    }
    @Test
    public void obtenerEdadFechaNull(){
        Paciente p = new Paciente();
        p.modificaFechaNac(null);
        Integer edad  = p.obtenerEdad();
        assertNull(edad);
        
    }
    @Test
    public void obtenerEdadFechaNotNull(){
        Paciente p = new Paciente();
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        p.modificaFechaNac(c.getTime());
        Integer edad  = p.obtenerEdad();
        assertNull(edad);
        
    }
    @Test
    public void obtenerEdadFechaValor(){
        Paciente p = new Paciente();
        Calendar c = Calendar.getInstance();
        c.set(2015, 4, 22);
        System.out.println(c.getTime());
        p.modificaFechaNac(c.getTime());
        Integer edad  = p.obtenerEdad();
        assertEquals(edad.intValue(), 6);
        
    }
}
