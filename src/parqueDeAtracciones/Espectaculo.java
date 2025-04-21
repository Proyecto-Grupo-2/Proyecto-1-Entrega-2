package parqueDeAtracciones;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Espectaculo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nomEspectaculo;
    private LocalDateTime dateMax;
    private LocalDateTime dateMin;
    private double alturaMax;
    private double alturaMin;

    public Espectaculo(String nomEspectaculo, LocalDateTime dateMin, LocalDateTime dateMax,
                       double alturaMin, double alturaMax) {
        this.nomEspectaculo = nomEspectaculo;
        this.dateMin = dateMin;
        this.dateMax = dateMax;
        this.alturaMin = alturaMin;
        this.alturaMax = alturaMax;
    }

    public String getNomEspectaculo() { return nomEspectaculo; }
    public LocalDateTime getDateMax() { return dateMax; }
    public LocalDateTime getDateMin() { return dateMin; }
    public double getAlturaMax() { return alturaMax; }
    public double getAlturaMin() { return alturaMin; }

    // Escribir Documento
    public static void escribirEspectaculosTxt(List<Espectaculo> espectaculos) {
        try {
            File carpeta = new File("./data/");
            if (!carpeta.exists()) carpeta.mkdirs();

            PrintWriter escritor = new PrintWriter(new File("./data/espectaculos.txt"));
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            for (Espectaculo e : espectaculos) {
                escritor.println(e.getNomEspectaculo() + "--" +
                        e.getDateMin().format(formato) + "--" +
                        e.getDateMax().format(formato) + "--" +
                        e.getAlturaMin() + "--" +
                        e.getAlturaMax());
            }

            escritor.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al escribir espectáculos: " + e.getMessage());
        }
    }

    // Leer Documento
    public static ArrayList<Espectaculo> leerEspectaculosTxt() {
        ArrayList<Espectaculo> espectaculos = new ArrayList<>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try (BufferedReader lector = new BufferedReader(new FileReader("./data/espectaculos.txt"))) {
            String linea = lector.readLine();
            while (linea != null) {
                String[] datos = linea.split("--");

                String nombre = datos[0];
                LocalDateTime dateMin = LocalDateTime.parse(datos[1], formato);
                LocalDateTime dateMax = LocalDateTime.parse(datos[2], formato);
                double alturaMin = Double.parseDouble(datos[3]);
                double alturaMax = Double.parseDouble(datos[4]);

                espectaculos.add(new Espectaculo(nombre, dateMin, dateMax, alturaMin, alturaMax));
                linea = lector.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error al leer espectáculos: " + e.getMessage());
        }

        return espectaculos;
    }
}
