package parqueDeAtracciones;

import java.util.ArrayList;

public class consolaAdministrador {

	
	private Parque miParque;

	public consolaAdministrador(Parque miParque) {
		super();
		this.miParque = miParque;
	}

	public Parque getMiParque() {
		return miParque;
	}

	public void setMiParque(Parque miParque) {
		this.miParque = miParque;
	}
	
	public ArrayList<Atraccion> consultarAtracciones(Parque parque){
		return parque.getListaAtracciones();
	}
	
	public ArrayList<Espectaculo> consultarEspectaculos(Parque parque){
		return parque.getListaEspectaculos();
	}
	

}
