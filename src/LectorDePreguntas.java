import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import MisExcepciones.FormatoDeFicheroIncorrecto;

public class LectorDePreguntas {

	static final private String MARCA_PREGUNTA = "<P>";
	static final private String MARCA_RESPUESTA = "<R>";
	static final private String MARCA_FINAL = "<\\PR>";
	
	ConjuntoDePreguntasList3 c_d_p;
	BufferedReader buffer = null;
	
	public LectorDePreguntas(ConjuntoDePreguntasList3 c_d_p, String nombre_fichero) {
		this.c_d_p = c_d_p;
		try {	
			FileReader fichero = new FileReader(nombre_fichero);
			this.buffer = new BufferedReader(fichero);
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}		
	}

	public ConjuntoDePreguntasList3 leer() {
		String linea = "";
		Pregunta nuevaPreg;
		String pregunta_actual = "";
		String respuesta_actual = "";
		boolean continuar = true;
		boolean primera_pregunta_leida = false;
		
		do {
			//Leyendo la primera linea de la pregunta: chequear marca <P>
			continuar = this.leerPrimeraLineaPregunta(primera_pregunta_leida); //Comprobamos la linea <P>
			if(continuar == false) continue;
			
			//Leyendo la segunda linea: la pregunta
			pregunta_actual = this.leerPreguntaSegundaLinea();
			
			//Leyendo la tercera linea: chequear marca <R>
			continuar = this.leerTerceraLinea();
			if(continuar == false) continue;
			
			//Leyendo la cuarta linea: la respuesta
			respuesta_actual = this.leerRespuestaCuartaLinea();
			
			//Leyendo la quinta linea: marca final
			continuar = this.leerQuintaLinea();
			if(continuar == false)  continue;
			
			//Añadiendo pregunta y respuesta la nueva pregunta
			nuevaPreg = new Pregunta(pregunta_actual, respuesta_actual);
			
			//Añadiendo la pregunta al conjunto
			this.c_d_p.add(nuevaPreg);			
			primera_pregunta_leida = true;
		} while (continuar);	
		return this.c_d_p;
	}
	
	private boolean leerPrimeraLineaPregunta (boolean primera_leida) {
		//Leyendo la primera linea de la pregunta:
		String linea_aux = "";
		linea_aux = this.leerLinea();

		if (linea_aux == null) {
			if (primera_leida == false) {
				throw new FormatoDeFicheroIncorrecto("Fichero vacï¿½o, formato ilegal!!.");
			}else {
				return false;
			}
		}else {
			if(!linea_aux.equals(LectorDePreguntas.MARCA_PREGUNTA)) {
				throw new FormatoDeFicheroIncorrecto("Falta la marca de pregunta");
			}
		}
		return true; //Si no hubo ningun problema y hay una <P> en la primera linea
	}
	
	private String leerPreguntaSegundaLinea() {
		
		String texto_pregunta = "";
		texto_pregunta = this.leerLinea();
		
		if(texto_pregunta == null) {
			throw new FormatoDeFicheroIncorrecto("Falta la pregunta");
		}
		return texto_pregunta;
	}
	
	private boolean leerTerceraLinea() {
		String linea_aux = "";
		linea_aux = this.leerLinea();
		
		if(linea_aux == null) {
			throw new FormatoDeFicheroIncorrecto("No has añadido marca de respuesta");
		}else{
			if(!linea_aux.equals(LectorDePreguntas.MARCA_RESPUESTA)) {
				throw new FormatoDeFicheroIncorrecto("Falta la marca de respuesta");
			}
		}
		return true;
	}
	
	private String leerRespuestaCuartaLinea() {
		
		String texto_pregunta = "";
		texto_pregunta = this.leerLinea();
		
		if(texto_pregunta == null) {
			throw new FormatoDeFicheroIncorrecto("Falta la respuesta");
		}
		return texto_pregunta;	
	}
	
	private boolean leerQuintaLinea() {
		String linea_aux = "";
		linea_aux = this.leerLinea();
		
		if(linea_aux == null) {
			throw new FormatoDeFicheroIncorrecto("No has añadido marca final");
		}else{
			if(!linea_aux.equals(LectorDePreguntas.MARCA_FINAL)) {
				throw new FormatoDeFicheroIncorrecto("Falta la marca de final");
			}
		}
		return true;
	}
	
	private String leerLinea() {
		String linea_aux= "";
		try {
			linea_aux = this.buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		
		return linea_aux;
	}
}
