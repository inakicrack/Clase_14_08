import java.io.BufferedReader;
import java.io.FileReader;
import MisExcepciones.FormatoDeFicheroIncorrecto;

public class LectorDePreguntas {
	
	Pregunta nuevaPreg; 
	String primeraLinea;
	FileReader fichero;
	
	do {
		
	} while(continuar);
	
		fichero = new FileReader("inicial.txt");
		BufferedReader buffer = new BufferedReader(fichero);
		primeraLinea = buffer.readLine();
		if(primeraLinea == null) {
			buffer.close();
			throw new FormatoDeFicheroIncorrecto("El fichero est� vac�o");
		}else {
			pregunta = ;
		}
		buffer.close();
}
