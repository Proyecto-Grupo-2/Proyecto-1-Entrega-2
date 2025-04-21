package Empleados;

import java.time.LocalDateTime;
import java.util.*;

public class Turno {

	private boolean esMañanero;
	private LocalDateTime fechaTurno;
	
	
	public Turno(boolean esMañanero, LocalDateTime fechaTurno) {
		super();
		this.esMañanero = esMañanero;
		this.fechaTurno = fechaTurno;
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

	
}
