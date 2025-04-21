package Tiquetes;

public class Tiquete {
	
	private Boolean used; 
	private Double precio; 
	private String idticket;
	private String loginUsuario;
	
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
	
	
	
}
	