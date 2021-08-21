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
	
	ConjuntoDePreguntas(){
		this.posicion_de_nueva_pregunta_a_insertar = 0;
		this.lista_de_preg = new Pregunta[ConjuntoDePreguntas.MAX_PREGUNTAS];
		for(int i = 0; i < this.lista_de_preg.length; i++ ) {
			this.lista_de_preg[i] = null;
		}
	}

	public void preguntar() {
		
		// como en el bloque else del if casi he copiado el bloque de abajo comentado
		boolean continuar = true;
		int indice = 0;
		
		@SuppressWarnings("resource")
		Scanner leer_linea = new Scanner(System.in);
		
		while(continuar) {
			if (indice < ConjuntoDePreguntas.MAX_PREGUNTAS ) {
				if(this.lista_de_preg[indice] == null) { //Cambie "!=" por "==" pq debe parar cuando encuentra el primer null. o sea == null.
					continuar = false; //Quite el == pq es una asigancion, no una comparacion
				}else {
					Pregunta preg = this.lista_de_preg[indice]; //Cambie "i" por "indice"
	
					System.out.println(preg.pregunta);
					
					String r_usuario = "";
					try {
						r_usuario = leer_linea.nextLine();
					} catch (Exception e) {
						System.out.println("HA PETADO EL SCANNER;  aver si nos dejas seguir...");
						System.out.println(e.getMessage());
					}
					
					r_usuario = r_usuario.trim().toUpperCase();
					String r_correcta = preg.respuesta_correcta.toUpperCase();
					
					if (r_correcta.equals(r_usuario)) {
						System.out.println("\nYes, playa!\n");
					}else {
						System.out.println("\nNo lo tienes muy claro...\n");	
					}			
				}
				indice ++; // Es el equivalente al i++ del for
			} else {
				continuar = false;
			}
		}
		//leer_linea.close();
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
