import java.util.Scanner;

public class ConjuntoDePreguntas {

	public Pregunta listaDePreg[];
	
	ConjuntoDePreguntas(Pregunta lDP[]){
		this.listaDePreg = lDP;
	}
	
	ConjuntoDePreguntas(){
		this.crearConjuntoDePreguntas();
	}
	
	/*
	 Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
		Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
		Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
		this.listaDePreg = new Pregunta [3];
		this.listaDePreg[0] = preg1;
		this.listaDePreg[1] = preg2;	
		this.listaDePreg[2] = preg3;
	 */
	
	public void crearConjuntoDePreguntas() {
		 Pregunta preg1 = new Pregunta ("¿Voy a aprobar el año que viene?", "SI");
			Pregunta preg2 = new Pregunta ("¿Va a ser difícil el año que viene?", "NO");
			Pregunta preg3 = new Pregunta ("¿Vamos a por todas?", "SI");
			this.listaDePreg = new Pregunta [3];
			this.listaDePreg[0] = preg1;
			this.listaDePreg[1] = preg2;	
			this.listaDePreg[2] = preg3;
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
				System.out.println("\nNo lo tienes my claro...\n");	
			}
		}
		leerLinea.close();
	}
	
}
