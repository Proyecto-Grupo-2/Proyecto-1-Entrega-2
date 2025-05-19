package Test;

import parqueDeAtracciones.*;
import Empleados.*;
import Tiquetes.Tiquete;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestConsolaAdministrador {

    public static void main(String[] args) {
        
        ArrayList<Empelado> empelados = new ArrayList<>();
        ArrayList<Atraccion> atracciones = new ArrayList<>();
        ArrayList<Espectaculo> espectaculos = new ArrayList<>();
        ArrayList<LugarServicio> lugares = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Turno> turnos = new ArrayList<>();

        Atraccion atr1 = new Atraccion("Montaña Rusa", "Zona A", 30, 2, null, null, null);
        Atraccion atr2 = new Atraccion("Casa del Terror", "Zona B", 20, 2, null, null, null);
        atracciones.add(atr1);
        atracciones.add(atr2);

        Espectaculo esp1 = new Espectaculo("Show Mágico", null, null, 1.0, 2.0);
        Espectaculo esp2 = new Espectaculo("Circo Extremo", null, null, 1.2, 2.5);
        espectaculos.add(esp1);
        espectaculos.add(esp2);

        LugarServicio lugar = new LugarServicio("Tienda Norte");
        lugares.add(lugar);

        Empelado emp = new Empelado(true, new ArrayList<>(), "EMP001", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        empelados.add(emp);

        // Parque y consola
        Parque parque = new Parque(empelados, atracciones, espectaculos, lugares, usuarios, turnos);
        consolaAdministrador admin = new consolaAdministrador(parque);

        System.out.println("▶️ TEST 1: consultarAtracciones");
        ArrayList<Atraccion> atrs = admin.consultarAtracciones(parque);
        for (Atraccion a : atrs) {
            System.out.println("- " + a.getNomAtraccion());
        }

        System.out.println("\n▶️ TEST 2: consultarEspectaculos");
        ArrayList<Espectaculo> esps = admin.consultarEspectaculos(parque);
        for (Espectaculo e : esps) {
            System.out.println("- " + e.getNomEspectaculo());
        }

        System.out.println("\n▶️ TEST 3: consultarAtraccionEspec (Casa del Terror)");
        Atraccion atrBuscada = admin.consultarAtraccionEspec(new Atraccion("Casa del Terror", "", 0, 0, null, null, null));
        if (atrBuscada != null) {
            System.out.println("✓ Atracción encontrada: " + atrBuscada.getNomAtraccion());
        } else {
            System.out.println("✗ Atracción no encontrada.");
        }

        System.out.println("\n▶️ TEST 4: consultarEspectaculoEspec (Circo Extremo)");
        Espectaculo espBuscado = admin.consultarEspectaculoEspec(new Espectaculo("Circo Extremo", null, null, 0, 0));
        if (espBuscado != null) {
            System.out.println("✓ Espectáculo encontrado: " + espBuscado.getNomEspectaculo());
        } else {
            System.out.println("✗ Espectáculo no encontrado.");
        }

        System.out.println("\n▶️ TEST 5: consultarTiquetesVendidos");
        ArrayList<Tiquete> tiquetes = admin.consultarTiquetesVendidos();
        if (tiquetes != null && !tiquetes.isEmpty()) {
            for (Tiquete t : tiquetes) {
                System.out.println("- Tiquete: " + t.getTipo());
            }
        } else {
            System.out.println("No hay tiquetes registrados o archivo vacío.");
        }

        System.out.println("\n▶️ TEST 6: asignarTurno a EMP001 en atracción 'Montaña Rusa'");
        admin.asignarTurno("EMP001", true, LocalDateTime.of(2025, 6, 10, 10, 0), "Atraccion", "Montaña Rusa");

        System.out.println("\n▶️ Turnos del empleado EMP001:");
        for (Turno t : emp.getListaTurnos()) {
            String destino = t.getEsEnAtraccion() ? t.getAtraccionTurno().getNomAtraccion() : t.getLugarTurno().getNomUnicoLugar();
            System.out.println("- Destino: " + destino + " | Fecha: " + t.getFechaTurno());
        }
    }
}
