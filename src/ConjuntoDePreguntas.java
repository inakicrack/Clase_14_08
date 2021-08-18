//Autor: Iñaki
//Fecha: 14/08/2021
/*
	Clase que nos sirve para crear listas de preguntas junto a sus métodos para que pueda leerse el solo con scanner,
	 añadir preguntas, comprobar que el array tiene espacio, etc.
*/

import java.util.Scanner;
import MisExcepciones.ArrayEstaLlenoException;

public class ConjuntoDePreguntas {

	public Pregunta listaDePreg[];
	static final int MAX_PREGUNTAS = 3;
	int posicionDeNuevaPreguntaAInsertar;
	
	ConjuntoDePreguntas(Pregunta lDP[]){
		this.listaDePreg = lDP;
		this.posicionDeNuevaPreguntaAInsertar = 0;
	}
	
	ConjuntoDePreguntas(){
		this.crearConjuntoDePreguntas();
	}
	
	/*
	 Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
		Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
		Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
		this.listaDePreg = new Pregunta [3];
		this.listaDePreg[0] = preg1;
		this.listaDePreg[1] = preg2;	
		this.listaDePreg[2] = preg3;
	 */
	
	public void crearConjuntoDePreguntas() {
		 Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
			Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
			Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
			this.listaDePreg = new Pregunta [3];
			this.listaDePreg[0] = preg1;
			this.listaDePreg[1] = preg2;	
			this.listaDePreg[2] = preg3;
	}
	
	public void preguntar() {
		
		Scanner leerLinea = new Scanner(System.in);
		
		for(int i = 0; i < this.listaDePreg.length; i++) {
			Pregunta preg = this.listaDePreg[i];
			
			System.out.println(preg.pregunta);
			
			String rUsuario = leerLinea.nextLine().trim().toUpperCase();
			String rCorrecta = preg.respuestaCorrecta.toUpperCase();
			
			if (rCorrecta.equals(rUsuario)) {
				System.out.println("\nYes, playa!\n");
			}else {
				System.out.println("\nNo lo tienes muy claro...\n");	
			}
		}
		leerLinea.close();
	}
	
	public void añadirPregunta(Pregunta nuevaPreg) {
		if(this.posicionDeNuevaPreguntaAInsertar == this.MAX_PREGUNTAS) {
			throw new ArrayEstaLlenoException("El array está lleno");
		}else {
			this.listaDePreg[this.posicionDeNuevaPreguntaAInsertar] = nuevaPreg;
		}		
	}	
}
