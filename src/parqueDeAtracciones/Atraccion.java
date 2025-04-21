package parqueDeAtracciones;

import java.time.LocalDateTime;

public class Atraccion {

	private String nomAtraccion;
	private String ubicacion;
	private int capMax;
	private int numMinEmp;
	private LocalDateTime dateMax;
	private LocalDateTime dateMin;
	private ExcLevel excLevel;
	public Atraccion(String nomAtraccion, String ubicacion, int capMax, int numMinEmp, LocalDateTime dateMax,
			LocalDateTime dateMin, ExcLevel excLevel) {
		super();
		this.nomAtraccion = nomAtraccion;
		this.ubicacion = ubicacion;
		this.capMax = capMax;
		this.numMinEmp = numMinEmp;
		this.dateMax = dateMax;
		this.dateMin = dateMin;
		this.excLevel = excLevel;
	}
	public String getNomAtraccion() {
		return nomAtraccion;
	}
	public void setNomAtraccion(String nomAtraccion) {
		this.nomAtraccion = nomAtraccion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCapMax() {
		return capMax;
	}
	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}
	public int getNumMinEmp() {
		return numMinEmp;
	}
	public void setNumMinEmp(int numMinEmp) {
		this.numMinEmp = numMinEmp;
	}
	public LocalDateTime getDateMax() {
		return dateMax;
	}
	public void setDateMax(LocalDateTime dateMax) {
		this.dateMax = dateMax;
	}
	public LocalDateTime getDateMin() {
		return dateMin;
	}
	public void setDateMin(LocalDateTime dateMin) {
		this.dateMin = dateMin;
	}
	public ExcLevel getExcLevel() {
		return excLevel;
	}
	public void setExcLevel(ExcLevel excLevel) {
		this.excLevel = excLevel;
	}
	
	
	
	
}
