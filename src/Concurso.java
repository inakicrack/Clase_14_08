
public class Concurso {

	public final Pregunta listaDePreg[];
	
	Concurso(Pregunta lDP[]){
		this.listaDePreg = lDP;
	}
	
	public void crearConcurso() {
		Pregunta preg1 = new Pregunta ("�Voy a aprobar el a�o que viene?", "SI");
		Pregunta preg2 = new Pregunta ("�Va a ser dif�cil el a�o que viene?", "NO");
		Pregunta preg3 = new Pregunta ("�Vamos a por todas?", "SI");
		Pregunta listaDePreg[] = new Pregunta [3];
		listaDePreg[0] = preg1;
		listaDePreg[1] = preg2;	
		listaDePreg[2] = preg3;
	}
}
