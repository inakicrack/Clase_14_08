import java.util.Random;
import java.util.Scanner;

import MisExcepciones.ArrayEstaLlenoException;
import MisExcepciones.NoSeEncuentraConjunto;

//Autor: Iñaki
//Fecha: 18/08/2021
//Clase que vamos a usar para hacer así conjuntos de a clase ConjuntoDePreguntas

public class BaseDeDatosDePreguntas {
	
	public ConjuntoDePreguntas lista_de_conj[];
	static final int MAX_CONJUNTOS = 3;
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
	
	public void preguntarLista() {
		Random aleatorio = new Random();
		int resultado = 0;
		
		for (int i = 0 ; i < 1; i++) {	
			resultado = aleatorio.nextInt(BaseDeDatosDePreguntas.MAX_CONJUNTOS);
		}
		
		if(this.lista_de_conj[resultado] == null) {
			throw new NoSeEncuentraConjunto("No se encuentra una lista de preguntas en esa posición del Array");
		}else {
			this.lista_de_conj[resultado].preguntar();
		}
	}
}
