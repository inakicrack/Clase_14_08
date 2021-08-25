import java.util.Random;

//Autor: Iñaki
//Fecha: 14/08/2021
//Clase que nos sirve para comprobar las cosas que estamos haciendo (clase main)


public class Reto1_Scanner {

	public static void main(String[] args) {	
			//Reto1_Scanner.p1();
			//Reto1_Scanner.imprimirRandom();
			//Reto1_Scanner.p2();
			//Reto1_Scanner.p3();
			//Reto1_Scanner.p4();
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
	
	public static void p2 () {
		ConjuntoDePreguntas c_d_p1 = new ConjuntoDePreguntas();
		Pregunta nuevaPreg = new Pregunta("¿Voy a aprobar el año que viene?", "SI");
		c_d_p1.anadirPregunta(nuevaPreg);
		nuevaPreg = new Pregunta("¿Va a ser difícil el año que viene?", "NO");
		c_d_p1.anadirPregunta(nuevaPreg);
		nuevaPreg = new Pregunta("¿Vamos a por todas?", "SI");
		c_d_p1.anadirPregunta(nuevaPreg);
		
		c_d_p1.preguntar();
		
		c_d_p1.eliminarPreg(1);
		c_d_p1.preguntar();
	}
	
	public static void p3 () {
		//Vamos a llamar al número máximo de preguntas
		System.out.println(ConjuntoDePreguntas.getMaxPreguntas());
	}
	
	public static void p4 () {
		BaseDeDatosDePreguntas base_1 = new BaseDeDatosDePreguntas();
		
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
		
		base_1.anadirLista(c_d_p1);
		base_1.anadirLista(c_d_p2);
		base_1.anadirLista(c_d_p3);
		
		base_1.preguntarLista();
	}
	
	public static void imprimirRandom ( ) {
		Random aleatorio = new Random();
		for (int i= 0 ; i < 10; i++) {
			int resultado;
			resultado = aleatorio.nextInt(20);
			System.out.println(resultado);
		}		
	}
}
