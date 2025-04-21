package parqueDeAtracciones;

import java.time.LocalDateTime;

public class Espectaculo {

	private String nomEspectaculo;
	private LocalDateTime dateMax;
	private LocalDateTime dateMin;
	private double alturaMax;
	private double alturaMin;
	public Espectaculo(String nomEspectaculo, LocalDateTime dateMax, LocalDateTime dateMin, double alturaMax,
			double alturaMin) {
		super();
		this.nomEspectaculo = nomEspectaculo;
		this.dateMax = dateMax;
		this.dateMin = dateMin;
		this.alturaMax = alturaMax;
		this.alturaMin = alturaMin;
	}
	public String getNomEspectaculo() {
		return nomEspectaculo;
	}
	public void setNomEspectaculo(String nomEspectaculo) {
		this.nomEspectaculo = nomEspectaculo;
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
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	public double getAlturaMin() {
		return alturaMin;
	}
	public void setAlturaMin(double alturaMin) {
		this.alturaMin = alturaMin;
	}
	
	
}
