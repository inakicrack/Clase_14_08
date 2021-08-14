import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		Pregunta reto1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
		Scanner leerLinea = new Scanner(System.in);
		boolean esCorrecta = true;
		
		while (esCorrecta) {
			System.out.println(reto1.pregunta);
			String respuestaDelUsuario = leerLinea.nextLine().trim();
			if (reto1.respuestaCorrecta.equals(respuestaDelUsuario.toUpperCase())) {
				esCorrecta = false;
				System.out.println("Yes, playa!");
			}else {
				System.out.println("\nQuiero que lo repitas hasta que la respuesta sea correcta\n");	
			}
		}
		leerLinea.close();
	}
}
