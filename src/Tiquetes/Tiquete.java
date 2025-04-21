package Tiquetes;

public class Tiquete {
	
	private Boolean used; 
	private Double precio; 
	private String idticket;
	
	public Tiquete(Boolean used, Double precio, String idticket) {
		super();
		this.used = used;
		this.precio = precio;
		this.idticket = idticket;
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
	
	
}
	