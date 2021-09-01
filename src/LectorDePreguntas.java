import java.io.BufferedReader;
import java.io.FileReader;
import MisExcepciones.FormatoDeFicheroIncorrecto;

public class LectorDePreguntas {
	
	public LectorDePreguntas() {
		Pregunta nuevaPreg; 
		String linea;
		FileReader fichero;
		boolean continuar = true;
		try {	
			fichero = new FileReader("Ejemplo_001");
			BufferedReader buffer = new BufferedReader(fichero);
			linea = buffer.readLine();
			if(linea == null) {
				buffer.close();
				throw new FormatoDeFicheroIncorrecto("El fichero está vacío");
			}else {
				do {
					if(linea == "<P>" || linea == "<R>") {
						
					}
				}while(continuar);
			}
			buffer.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
		}
	}

	
}
