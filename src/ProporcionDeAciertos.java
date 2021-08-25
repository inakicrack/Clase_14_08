
public class ProporcionDeAciertos {
	private int pregunta_totales;
	private int respuesta_acertadas;
	
	ProporcionDeAciertos(int preg, int res){
		this.pregunta_totales = preg;
		this.respuesta_acertadas = res;
	}
	
	ProporcionDeAciertos(){
		this.pregunta_totales = 0;
		this.respuesta_acertadas = 0;
	}
	
	public int getPreguntasTotales() {
		return pregunta_totales;
	}

	public int getRespuestaAcertadas() {
		return respuesta_acertadas;
	}
	
	public void setPreguntasTotales(int preg) {
		this.pregunta_totales = preg;
	}
	
	public void setRespuestasAcertadas(int res) {
		this.respuesta_acertadas = res;
	}
	
	public String getProporcion() {
		return String.valueOf(this.getRespuestaAcertadas()) + "/" + String.valueOf(this.getPreguntasTotales());	
	}
	
	public String toString() {
		return this.getProporcion();
	}
	
	public void sumar(ProporcionDeAciertos prop) {
		this.setPreguntasTotales(this.getPreguntasTotales() + prop.getPreguntasTotales());
		this.setRespuestasAcertadas(this.getRespuestaAcertadas() + prop.getRespuestaAcertadas());
	}

}

