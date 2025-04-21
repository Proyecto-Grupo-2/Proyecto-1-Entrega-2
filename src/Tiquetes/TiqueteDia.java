package Tiquetes;
import java.time.LocalDateTime;

public class TiqueteDia extends Tiquete {
	private LocalDateTime fechatiquete;

	public TiqueteDia(Boolean used, Double precio, String idticket, LocalDateTime fechatiquete) {
		super(used, precio, idticket);
		this.fechatiquete = fechatiquete;
	}

	public LocalDateTime getFechatiquete() {
		return fechatiquete;
	}

	public void setFechatiquete(LocalDateTime fechatiquete) {
		this.fechatiquete = fechatiquete;
	} 
	
	
}
