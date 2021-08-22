import MisExcepciones.ArrayEstaLlenoException;

//Autor: Iñaki
//Fecha: 18/08/2021
//Clase que vamos a usar para hacer así conjuntos de a clase ConjuntoDePreguntas

public class BaseDeDatosDePreguntas {
	
	public ConjuntoDePreguntas lista_de_conj[];
	static final int MAX_CONJUNTOS = 1;
	int posicion_de_nuevo_conjunto_a_insertar;
	
	BaseDeDatosDePreguntas(){
		this.posicion_de_nuevo_conjunto_a_insertar = 0;
		this.lista_de_conj = new ConjuntoDePreguntas[BaseDeDatosDePreguntas.MAX_CONJUNTOS];
		for(int i = 0; i < this.lista_de_conj.length; i++ ) {
			this.lista_de_conj[i] = null;
		}
	}
	
	public void anadirLista(ConjuntoDePreguntas nueva_lista) {
		if(this.posicion_de_nuevo_conjunto_a_insertar == MAX_CONJUNTOS) {
			throw new ArrayEstaLlenoException("El array está lleno");
		}else {
			this.lista_de_conj[this.posicion_de_nuevo_conjunto_a_insertar] = nueva_lista;
			this.posicion_de_nuevo_conjunto_a_insertar++;
		}		
	}
}
