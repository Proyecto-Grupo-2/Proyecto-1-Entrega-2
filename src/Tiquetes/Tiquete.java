package Tiquetes;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class Tiquete  {
	
	private Boolean used; 
	private Double precio; 
	private String idticket;
	private String loginUsuario;
	private String tipo;  

	
	public Tiquete(Boolean used, Double precio, String idticket, String loginUsuario) {
		super();
		this.used = used;
		this.precio = precio;
		this.idticket = idticket;
		this.loginUsuario=loginUsuario;
	}
	public Boolean getUsed() {
		return used;
	}
	public void setUsed(Boolean used) {
		this.used = used;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getIdticket() {
		return idticket;
	}
	public void setIdticket(String idticket) {
		this.idticket = idticket;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	} 

		
		
		//Escribir Documento 
		public static void escribirTiquetestxt(List<Tiquete> tiquetes) {
			try {
				File carpeta = new File("./data/");
				if(!carpeta.exists()) carpeta.mkdirs();
				
				PrintWriter escritor = new PrintWriter(new File("./data/tiquetes.txt"));
				
				for (Tiquete t : tiquetes) {
					escritor.println(t.getIdticket() + "--" +
				    t.getPrecio() + "--" + 
					t.getUsed() + "--" +
				    t.getLoginUsuario());
				}
				
				escritor.close();
			} catch (FileNotFoundException e) {
				System.err.println("Error al escribir tiquetes: " + e.getMessage());
			}
		}
		
		
		//Leer documento
		public static ArrayList<Tiquete> leerTiquetesTxt() {
		    ArrayList<Tiquete> tiquetes = new ArrayList<>();
		    File archivo = new File("./data/tiquetes.txt");

		    try {
		        // 1. Si el archivo no existe, crear la carpeta y el archivo vacío
		        if (!archivo.exists()) {
		            archivo.getParentFile().mkdirs(); // Crea la carpeta ./data si no existe
		            archivo.createNewFile();          // Crea el archivo vacío
		            System.out.println("📄 Archivo vacío tiquetes.txt creado.");
		            return tiquetes; // No hay datos aún
		        }

		        // 2. Leer archivo normalmente si existe
		        BufferedReader lector = new BufferedReader(new FileReader(archivo));
		        String linea = lector.readLine();
		        while (linea != null) {
		            String[] datos = linea.split("--");

		            // Validar que hay al menos 4 campos
		            if (datos.length >= 4) {
		                String idticket = datos[0];
		                double precio = Double.parseDouble(datos[1]);
		                boolean used = Boolean.parseBoolean(datos[2]);
		                String loginUsuario = datos[3];

		                Tiquete t = new Tiquete(used, precio, idticket, loginUsuario);
		                t.setLoginUsuario(loginUsuario); // si tu clase lo necesita
		                tiquetes.add(t);
		            }

		            linea = lector.readLine();
		        }

		        lector.close();
		    } catch (IOException e) {
		        System.err.println("❌ Error al leer tiquetes: " + e.getMessage());
		    }

		    return tiquetes;
		}

		
		public String getTipo() {
		    return tipo;
		}

	}
	

	