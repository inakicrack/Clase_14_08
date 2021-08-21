import java.util.Random;

//Autor: Iñaki
//Fecha: 14/08/2021
//Clase que nos sirve para comprobar las cosas que estamos haciendo (clase main)


public class Reto1_Scanner {

	public static void main(String[] args) {	
			//Reto1_Scanner.p1();
			Reto1_Scanner.imprimirRandom();
		
	}
	
	public static void p1 () {
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

		c_d_p1.preguntar();
		c_d_p2.preguntar();
		c_d_p3.preguntar();		
	}
	
	public static void imprimirRandom ( ) {
		Random aleatorio = new Random();
		int[] valor_aleatorio;
		for (int i= 0 ; i < 10; i++) {
			//valor_aleatorio = aleatorio.ints(1, 0, 10).toArray();
			valor_aleatorio = aleatorio.ints(1, 0, 10).toArray();
			System.out.println(valor_aleatorio[0]);
		}
		
	}
}
