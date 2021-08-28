
import java.util.LinkedList;
import java.util.Random;
import MisExcepciones.NoSeEncuentraConjunto;

public class BaseDeDatosDePreguntasList3 extends LinkedList<ConjuntoDePreguntasList3>{
		
	public void preguntarLista() {
		Proporcion prop = new Proporcion();
		for(ConjuntoDePreguntasList3 conj: this) {
			conj.preguntar(prop);
		}
		System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "¡¡Has acertado " + prop.toString() + "!!");
	}	
}

