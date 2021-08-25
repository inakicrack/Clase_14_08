//Autor: Iñaki
//Fecha: 14/08/2021
//Clase que nos sirve para hacer preguntas junto a sus respuestas correctas.

public class Pregunta {

	private final String pregunta;
	private final String respuesta_correcta;
	
	Pregunta(String preg, String res){
		this.pregunta = preg;
		this.respuesta_correcta = res;
	}
	
	public String getPregunta() {
		return pregunta;
	}

	public String getRespuestaCorrecta() {
		return respuesta_correcta;
	}
}
