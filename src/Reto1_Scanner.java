import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		
/*		Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
		Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
		Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
		Pregunta listaDePreg[] = new Pregunta [3];
		listaDePreg[0] = preg1;
		listaDePreg[1] = preg2;	
		listaDePreg[2] = preg3;
*/		
		ConjuntoDePreguntas proxCDP = new ConjuntoDePreguntas(null);
		Scanner leerLinea = new Scanner(System.in);
		proxCDP.crearConjuntoDePreguntas();
		
		for(int i = 0; i < proxCDP.listaDePreg.length; i++) {
			Pregunta preg = proxCDP.listaDePreg[i];
			
			System.out.println(preg.pregunta);
			
			String rUsuario = leerLinea.nextLine().trim().toUpperCase();
			String rCorrecta = preg.respuestaCorrecta.toUpperCase();
			
			if (rCorrecta.equals(rUsuario)) {
				System.out.println("\nYes, playa!\n");
			}else {
				System.out.println("\nNo lo tienes my claro...\n");	
			}
		}
		leerLinea.close();
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
