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
	
	public void anadirPregunta(Pregunta nuevaPreg) {
		if(this.posicionDeNuevaPreguntaAInsertar == MAX_PREGUNTAS) {
			throw new ArrayEstaLlenoException("El array está lleno");
		}else {
			this.listaDePreg[this.posicionDeNuevaPreguntaAInsertar] = nuevaPreg;
		}		
	}	
}
