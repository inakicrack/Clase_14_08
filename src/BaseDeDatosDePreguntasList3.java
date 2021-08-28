
import java.util.LinkedList;
import java.util.Random;
import MisExcepciones.NoSeEncuentraConjunto;

public class BaseDeDatosDePreguntasList3 extends LinkedList<ConjuntoDePreguntasList2>{
		
	public void preguntarLista() {
		Proporcion prop = new Proporcion(0,0);
		Proporcion prop_sumable = new Proporcion(0,0);
		for(ConjuntoDePreguntasList2 conj: this) {
			prop_sumable = conj.preguntar();
			prop.sumar(prop_sumable);
		}
		System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "¡¡Has acertado " + prop.toString() + "!!");
	}	
}

