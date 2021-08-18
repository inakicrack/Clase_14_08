//Autor: Iñaki
//Fecha: 14/08/2021
/*
	Clase que nos sirve para crear listas de preguntas junto a sus métodos para que pueda leerse el solo con scanner,
	añadir preguntas, comprobar que el array tiene espacio, etc.
*/

import java.util.Scanner;
import MisExcepciones.ArrayEstaLlenoException;

public class ConjuntoDePreguntas {

	public Pregunta lista_de_preg[];
	static final int MAX_PREGUNTAS = 3;
	int posicion_de_nueva_pregunta_a_insertar;
	
	ConjuntoDePreguntas(Pregunta lDP[]){
		this.lista_de_preg = lDP;
		this.posicion_de_nueva_pregunta_a_insertar = 0;
	}
	
	ConjuntoDePreguntas(){
		this.lista_de_preg.length < MAX_PREGUNTAS;
	}


	
	public void preguntar() {
		
		Scanner leerLinea = new Scanner(System.in);
		
		for(int i = 0; i < this.lista_de_preg.length; i++) {
			Pregunta preg = this.lista_de_preg[i];
			
			System.out.println(preg.pregunta);
			
			String rUsuario = leerLinea.nextLine().trim().toUpperCase();
			String rCorrecta = preg.respuesta_correcta.toUpperCase();
			
			if (rCorrecta.equals(rUsuario)) {
				System.out.println("\nYes, playa!\n");
			}else {
				System.out.println("\nNo lo tienes muy claro...\n");	
			}
		}
		leerLinea.close();
	}
	
	public void anadirPregunta(Pregunta nuevaPreg) {
		if(this.posicion_de_nueva_pregunta_a_insertar == MAX_PREGUNTAS) {
			throw new ArrayEstaLlenoException("El array está lleno");
		}else {
			this.lista_de_preg[this.posicion_de_nueva_pregunta_a_insertar] = nuevaPreg;
			this.posicion_de_nueva_pregunta_a_insertar++;
		}		
	}	
}
