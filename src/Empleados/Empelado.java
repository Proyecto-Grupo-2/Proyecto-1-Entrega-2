package Empleados;

import java.util.*;


public class Empelado {

	private boolean esAutorizado;
	private List<Boolean> listaHabilidades= new ArrayList<>();
	private String IdUnicoEmp;
	
	public Empelado(boolean esAutorizado, List<Boolean> listaHabilidades, String idUnicoEmp) {
		super();
		this.esAutorizado = esAutorizado;
		this.listaHabilidades = listaHabilidades;
		IdUnicoEmp = idUnicoEmp;
	}
	public boolean isEsAutorizado() {
		return esAutorizado;
	}
	public void setEsAutorizado(boolean esAutorizado) {
		this.esAutorizado = esAutorizado;
	}
	public List<Boolean> getListaHabilidades() {
		return listaHabilidades;
	}
	public void setListaHabilidades(List<Boolean> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}
	public String getIdUnicoEmp() {
		return IdUnicoEmp;
	}
	public void setIdUnicoEmp(String idUnicoEmp) {
		IdUnicoEmp = idUnicoEmp;
	}
	
	
	
}
