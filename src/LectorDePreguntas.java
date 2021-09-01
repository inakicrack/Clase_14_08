import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import MisExcepciones.FormatoDeFicheroIncorrecto;

public class LectorDePreguntas {
	static private String MARCA_INICIO_PREGUNTA = "<P>";
	static private String MARCA_INICIO_RESPUESTA = "<R>";
	static private String MARCA_FINAL = "<\\PR>";
	


	FileReader fichero= null;
	boolean continuar = true;
	BufferedReader buffer = null;
	boolean primera_pregunta_leida = false;
	
	
	public LectorDePreguntas() {

		String linea = "";
		ConjuntoDePreguntasList3 lista = new ConjuntoDePreguntasList3();
		Pregunta nuevaPreg;
		String pregunta_actual = "";
		String respuesta_actual = "";
		
		try {	
			fichero = new FileReader("Ejemplo_001");
			buffer = new BufferedReader(fichero);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		do {
			//Leyendo la primera linea de la pregunta:
			continuar = this.leer_primera_linea_pregunta(); //Comprobamos la linea <P>
			
			// Leyendo la segunda linea: la pregunta
			
			
			
			
			
		
			primera_pregunta_leida = true;
		} while (continuar);
	}
	
	private boolean leer_primera_linea_pregunta () {
		//Leyendo la primera linea de la pregunta:
		String linea_aux= "";
		try {
			linea_aux = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		if (linea_aux == null) {
			
			if (this.primera_pregunta_leida == false) {
				throw new FormatoDeFicheroIncorrecto("Fichero vacío, formato ilegal!!.");
			} else {
				return false;
			}
		}
		return true; //Si no hubo ningun problema y hay una <P> en la primera linea
	}
	
	private String leer_pregunta_2da_linea() {
		
		
	}

	
}
