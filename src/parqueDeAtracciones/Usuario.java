package parqueDeAtracciones;

public class Usuario {
	private String login; 
	private String password; 
	private Boolean esEmpleado;
	private Boolean esAdministrador;
	
	public Usuario(String login, String password, Boolean esEmpleado, Boolean esAdministrador) {
		super();
		this.login = login;
		this.password = password;
		this.esEmpleado = esEmpleado;
		this.esAdministrador = esAdministrador;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEsEmpleado() {
		return esEmpleado;
	}
	public void setEsEmpleado(Boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}
	public Boolean getEsAdministrador() {
		return esAdministrador;
	}
	public void setEsAdministrador(Boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	} 
	
	
}
