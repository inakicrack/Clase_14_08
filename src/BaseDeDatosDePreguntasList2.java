//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

import MisExcepciones.NoSeEncuentraConjunto;

public class BaseDeDatosDePreguntasList2 extends ArrayList<ConjuntoDePreguntasList2>{
	
	public void preguntarLista() {
		ProporcionDeAciertos prop = new ProporcionDeAciertos(0,0);
		ProporcionDeAciertos prop_sumable = new ProporcionDeAciertos(0,0);
		for(ConjuntoDePreguntasList2 conj: this) {
			prop_sumable = conj.preguntar();
			prop.sumar(prop_sumable);
		}
		System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "¡¡Has acertado " + prop.toString() + "!!");
	}	
}

