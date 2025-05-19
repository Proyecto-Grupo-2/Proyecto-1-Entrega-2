package test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Tiquetes.FastPass;
import Tiquetes.Tiquete;
import parqueDeAtracciones.Atraccion;
import parqueDeAtracciones.Espectaculo;
import parqueDeAtracciones.ExcLevel;
import parqueDeAtracciones.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {

        ArrayList<Atraccion> listaAtracciones = new ArrayList<>();
        ArrayList<Espectaculo> listaEspectaculos = new ArrayList<>();
        ArrayList<Tiquete> listaTiquetes = new ArrayList<>();
        ArrayList<FastPass> listaFastPass = new ArrayList<>();


        usuario = new Usuario("juan123", "claveSegura", false, false,
                listaAtracciones, listaEspectaculos, listaFastPass, listaTiquetes);


        usuario.añadirAtraccion(new Atraccion(
                "Montaña Rusa",
                "Zona A",
                30,
                3,
                LocalDateTime.of(2025, 6, 1, 10, 0),
                LocalDateTime.of(2025, 6, 1, 18, 0),
                ExcLevel.DIAMANTE
        ));

        usuario.añadirEspectaculo(new Espectaculo(
                "Show de Magia",
                LocalDateTime.of(2025, 6, 1, 12, 0),
                LocalDateTime.of(2025, 6, 1, 14, 0),
                1.8,
                1.2
        ));
    }

    @Test
    public void testConsultarInfoAtraccionEspec_Existe() {
        Atraccion resultado = usuario.consultarInfoAtraccionEspec("Montaña Rusa");
        assertNotNull(resultado);
        assertEquals("Montaña Rusa", resultado.getNomAtraccion());
    }

    @Test
    public void testConsultarInfoAtraccionEspec_NoExiste() {
        Atraccion resultado = usuario.consultarInfoAtraccionEspec("Casa del Terror");
        assertNull(resultado);
    }

    @Test
    public void testConsultarInfoEspectaculoEspec_Existe() {
        Espectaculo resultado = usuario.consultarInfoEspectaculoEspec("Show de Magia");
        assertNotNull(resultado);
        assertEquals("Show de Magia", resultado.getNomEspectaculo());
    }

    @Test
    public void testConsultarInfoEspectaculoEspec_NoExiste() {
        Espectaculo resultado = usuario.consultarInfoEspectaculoEspec("Show Acrobático");
        assertNull(resultado);
    }
    
}