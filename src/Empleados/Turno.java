package Empleados;

import java.time.LocalDateTime;
import java.util.*;

import parqueDeAtracciones.Atraccion;

public class Turno {

	private boolean esMañanero;
	private LocalDateTime fechaTurno;
	private LugarServicio lugarTurno; 
	private Empelado empAsignado; 
	private Atraccion atraccionTurno;
	private Boolean esEnAtraccion; 
	public Turno(boolean esMañanero, LocalDateTime fechaTurno, LugarServicio lugarTurno, Empelado empAsignado,
			Atraccion atraccionTurno, boolean esEnAtraccion) {
		super();
		this.esMañanero = esMañanero;
		this.fechaTurno = fechaTurno;
		this.lugarTurno = lugarTurno;
		this.empAsignado = empAsignado;
		this.atraccionTurno = atraccionTurno;
		this.esEnAtraccion = esEnAtraccion;
	}
	public boolean isEsMañanero() {
		return esMañanero;
	}
	public void setEsMañanero(boolean esMañanero) {
		this.esMañanero = esMañanero;
	}
	public LocalDateTime getFechaTurno() {
		return fechaTurno;
	}
	public void setFechaTurno(LocalDateTime fechaTurno) {
		this.fechaTurno = fechaTurno;
	}
	
	
	public Boolean getEsEnAtraccion() {
		return esEnAtraccion;
	}
	public void setEsEnAtraccion(Boolean esEnAtraccion) {
		this.esEnAtraccion = esEnAtraccion;
	}
	public LugarServicio getLugarTurno() {
		return lugarTurno;
	}
	
	public Empelado getEmpAsignado() {
		return empAsignado;
	}
	public void setEmpAsignado(Empelado empAsignado) {
		this.empAsignado = empAsignado;
	}
	public Atraccion getAtraccionTurno() {
		return atraccionTurno;
	}

	public void setAtraccionTurno(Atraccion atraccionTurno) {
		if (esEnAtraccion) {
			this.atraccionTurno = atraccionTurno;
		}
		else {
			this.atraccionTurno = null;
		}
		
	}
	
	public void setLugarTurno(LugarServicio lugarTurno) {
		if (esEnAtraccion) {
			this.lugarTurno = null;
		}
		else {
			this.lugarTurno = lugarTurno;
		}
		
	}
	
	
}
