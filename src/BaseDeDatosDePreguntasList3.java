
import java.util.LinkedList;
import java.util.Random;
import MisExcepciones.NoSeEncuentraConjunto;

public class BaseDeDatosDePreguntasList3 extends LinkedList<ConjuntoDePreguntasList3>{
		
	public void preguntarLista() {
		Proporcion prop = new Proporcion();
		for(ConjuntoDePreguntasList3 conj: this) {
			conj.preguntar(prop);
		}
		saludoFinal(prop);
	}
	
	public void saludoFinal(Proporcion prop) {
		switch(prop.getRespuestaAcertadas()) {
			case 0:	
				System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "\nHas acertado " + prop.toString() + "...\n\n¡¡No has dado ni una!!");
				break;
			case 1:
			case 2:
			case 3:
				System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "\nHas acertado " + prop.toString() + "...\n\nLo sentimos, has perdido");
				break;
			case 4:
			case 5:
				System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "\nHas acertado " + prop.toString() + "...\n\n¡Casi lo consigues!");
				break;
			case 6:
				System.out.println("\n¡¡Se ha acabado el concurso!!\n" + "\n¡¡Has acertado " + prop.toString() + "!!\n\n¡¡Has ganado el concurso!!");
				break;
			default:
				System.out.println("¿Que coño has hecho?");
				break;
		}
		
	}
}

