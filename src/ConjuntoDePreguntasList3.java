import java.util.LinkedList;
import java.util.Scanner;

public class ConjuntoDePreguntasList3 extends LinkedList<Pregunta>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public void preguntar(Proporcion prop) {
		@SuppressWarnings("resource") //Porque estamos leyendo de teclado y no lo vamos a cerrar
		Scanner leer_linea = new Scanner(System.in);
		int respuestas_acertadas = 0;
		int preguntas_totales = 0;
		
		for(Pregunta preg: this) {
			System.out.println(preg.getPregunta());
			preguntas_totales = preguntas_totales + 1;
			
			String r_usuario = "";
			try {
				r_usuario = leer_linea.nextLine();
			} catch (Exception e) {
				System.out.println("HA PETADO EL SCANNER;  aver si nos dejas seguir...");
				System.out.println(e.getMessage());
			}
			
			r_usuario = r_usuario.trim().toUpperCase();
			String r_correcta = preg.getRespuestaCorrecta().toUpperCase();
			
			if (r_correcta.equals(r_usuario)) {
				System.out.println("\nYes, playa!\n");
				respuestas_acertadas = respuestas_acertadas + 1;
			}else {
				System.out.println("\nNo lo tienes muy claro...\n");	
			}
		}		
		//Aquí iría el cierre de Scanner pero como estamos leyendo de teclado no lo hacemos
		//prop.setPreguntasTotales(preguntas_totales);
		//prop.setRespuestasAcertadas(respuestas_acertadas);
		prop.setPreguntasTotales(prop.getPreguntasTotales() + preguntas_totales);
		prop.setRespuestasAcertadas(prop.getRespuestaAcertadas() + respuestas_acertadas);
	}
}
