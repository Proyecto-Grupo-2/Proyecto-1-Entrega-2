package Empleados;

import java.lang.reflect.Array;
import java.util.*;

import parqueDeAtracciones.Atraccion;
import parqueDeAtracciones.Espectaculo;


public class Empelado {

	private boolean esAutorizado;
	
	private ArrayList<Boolean> listaHabilidades= new ArrayList<Boolean>();
	
	private String IdUnicoEmp;
	
	private ArrayList<Turno> listaTurnos= new ArrayList<Turno>(); 
	
	private ArrayList<Atraccion> listaAtracciones= new ArrayList<Atraccion>(); 

	private ArrayList<Espectaculo> listaEspectaculos= new ArrayList<Espectaculo>(); 

	private ArrayList<Atraccion> listaAtraccionesPermitidas= new ArrayList<Atraccion>(); 
	

	public Empelado(boolean esAutorizado, ArrayList<Boolean> listaHabilidades, String idUnicoEmp,
			ArrayList<Turno> listaTurnos, ArrayList<Atraccion> listaAtracciones,
			ArrayList<Espectaculo> listaEspectaculos, ArrayList<Atraccion> listaAtraccionesPermitidas) {
		super();
		this.esAutorizado = esAutorizado;
		this.listaHabilidades = listaHabilidades;
		IdUnicoEmp = idUnicoEmp;
		this.listaTurnos = listaTurnos;
		this.listaAtracciones = listaAtracciones;
		this.listaEspectaculos = listaEspectaculos;
		this.listaAtraccionesPermitidas = listaAtraccionesPermitidas;
	}

	public boolean isEsAutorizado() {
		return esAutorizado;
	}

	public void setEsAutorizado(boolean esAutorizado) {
		this.esAutorizado = esAutorizado;
	}

	public ArrayList<Boolean> getListaHabilidades() {
		return listaHabilidades;
	}

	public void setListaHabilidades(ArrayList<Boolean> listaHabilidades) {
		this.listaHabilidades = listaHabilidades;
	}

	public String getIdUnicoEmp() {
		return IdUnicoEmp;
	}

	public void setIdUnicoEmp(String idUnicoEmp) {
		IdUnicoEmp = idUnicoEmp;
	}

	public ArrayList<Turno> getListaTurnos() {
		return listaTurnos;
	}

	public void setListaTurnos(ArrayList<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}

	
	public ArrayList<Atraccion> getListaAtracciones() {
		return listaAtracciones;
	}
	public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
		this.listaAtracciones = listaAtracciones;
	}

	
	public ArrayList<Espectaculo> getListaEspectaculos() {
		return listaEspectaculos;
	}
	public void setListaEspectaculos(ArrayList<Espectaculo> listaEspectaculos) {
		this.listaEspectaculos = listaEspectaculos;
	}

	
	public ArrayList<Atraccion> getListaAtraccionesPermitidas() {
		return listaAtraccionesPermitidas;
	}
	public void setListaAtraccionesPermitidas(ArrayList<Atraccion> listaAtraccionesPermitidas) {
		this.listaAtraccionesPermitidas = listaAtraccionesPermitidas;
	}
	
	//aca empiezan los add 

	public void añadirAtraccion(Atraccion atraccion) {
		this.listaAtracciones.add(atraccion);
	}
	
	public void añadirEspectaculo(Espectaculo espectaculo) {
		this.listaEspectaculos.add(espectaculo);
	}
	
	public void añadirTurno(Turno turno) {
		this.listaTurnos.add(turno);
	}
	
	

// y falta lo de la lista de habilidades que nose como putas lo voy a hacer 
}
