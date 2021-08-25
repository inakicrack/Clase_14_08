import java.util.LinkedList;
import java.util.Scanner;

public class ConjuntoDePreguntasList {

	public LinkedList<Pregunta> lista_de_preg;
	
	public ConjuntoDePreguntasList() {
		this.lista_de_preg = new LinkedList<Pregunta>();
	}
	
	public void preguntar() {
		@SuppressWarnings("resource") //Porque estamos leyendo de teclado y no lo vamos a cerrar
		Scanner leer_linea = new Scanner(System.in);
		
		for(Pregunta preg: this.lista_de_preg) {
			System.out.println(preg.getPregunta());
			
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
			}else {
				System.out.println("\nNo lo tienes muy claro...\n");	
			}
		}
		//Aquí iría el cierre de Scanner pero como estamos leyendo de teclado no lo hacemos
	}
	
	public void add(Pregunta nueva_preg) {
		this.lista_de_preg.add(nueva_preg);
	}
}
