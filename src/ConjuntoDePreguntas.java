
public class ConjuntoDePreguntas {

	public Pregunta listaDePreg[];
	
	ConjuntoDePreguntas(Pregunta lDP[]){
		this.listaDePreg = lDP;
	}
	
	ConjuntoDePreguntas(){
		this.crearConjuntoDePreguntas();
	}
	
	ConjuntoDePreguntas(Pregunta unta){
		
	}
	
	public void crearConjuntoDePreguntas() {
		Pregunta preg1 = new Pregunta ("�Voy a aprobar el a�o que viene?", "SI");
		Pregunta preg2 = new Pregunta ("�Va a ser dif�cil el a�o que viene?", "NO");
		Pregunta preg3 = new Pregunta ("�Vamos a por todas?", "SI");
		this.listaDePreg = new Pregunta [3];
		this.listaDePreg[0] = preg1;
		this.listaDePreg[1] = preg2;	
		this.listaDePreg[2] = preg3;
	}
}
