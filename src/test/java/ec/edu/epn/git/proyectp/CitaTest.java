package ec.edu.epn.git.proyectp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CitaTest {
    Cita ci = new Cita();
    @org.junit.Test
    public void register_materia(){
        assertEquals(true,ci.validaCurso("ICR222"));
    }
    @org.junit.Test
    public void register_tutor(){
        assertSame(true, ci.registroTutor("ICR222","Jaime Gonzales"));
    }
    @org.junit.Test
    public void validation_data(){
        assertEquals(true, ci.validaIngreso("ICR223","Juan de la Peña","12/02/2021","12:35"));
    }
    @Test
    public void exist_cita(){
        assertTrue(ci.existeCita("223"));
    }

}