
public class ConjuntoDePreguntas {

	public final Pregunta listaDePreg[];
	
	ConjuntoDePreguntas(Pregunta lDP[]){
		this.listaDePreg = lDP;
	}
	
	ConjuntoDePreguntas(){
		this.crearConjuntoDePreguntas();
	}
	
	public void crearConjuntoDePreguntas() {
		Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
		Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
		Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
		Pregunta listaDePreg[] = new Pregunta [3];
		listaDePreg[0] = preg1;
		listaDePreg[1] = preg2;	
		listaDePreg[2] = preg3;
	}
}
