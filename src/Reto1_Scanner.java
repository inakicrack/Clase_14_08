//Autor: Iñaki
//Fecha: 14/08/2021
//Clase que nos sirve para comprobar las cosas que estamos haciendo (clase main)


public class Reto1_Scanner {

	public static void main(String[] args) {	
		ConjuntoDePreguntas c_d_p1 = new ConjuntoDePreguntas();
		Pregunta nuevaPreg = new Pregunta("¿Voy a aprobar el año que viene?", "SI");
		c_d_p1.anadirPregunta(nuevaPreg);
		nuevaPreg = new Pregunta("¿Va a ser difícil el año que viene?", "NO");
		c_d_p1.anadirPregunta(nuevaPreg);
		nuevaPreg = new Pregunta("¿Vamos a por todas?", "SI");
		c_d_p1.anadirPregunta(nuevaPreg);
		
		ConjuntoDePreguntas c_d_p2 = new ConjuntoDePreguntas();
		nuevaPreg = new Pregunta("¿Hay ganas de empezar el año?", "SI");
		c_d_p2.anadirPregunta(nuevaPreg);
		nuevaPreg = new Pregunta("¿Estás seguro?", "SI");
		c_d_p2.anadirPregunta(nuevaPreg);
		
		ConjuntoDePreguntas c_d_p3 = new ConjuntoDePreguntas();
		nuevaPreg = new Pregunta("¿Hace calor?", "SI");
		c_d_p3.anadirPregunta(nuevaPreg);
/*
		while (esCorrecta) {

			System.out.println(preg1.pregunta);
			String respuestaDelUsuario = leerLinea.nextLine().trim();
			if (preg1.respuestaCorrecta.equals(respuestaDelUsuario.toUpperCase())) {
				esCorrecta = false;
				System.out.println("Yes, playa!");
			}else {
				System.out.println("\nQuiero que lo repitas hasta que la respuesta sea correcta\n");	
			}
		}
		leerLinea.close();

 */	
	}
}
