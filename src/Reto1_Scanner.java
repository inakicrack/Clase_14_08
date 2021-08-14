import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		Scanner leerLinea = new Scanner(System.in);
		final String RESPUESTA_CORRECTA = "SI";
		boolean esCorrecta = true;
		
		while (esCorrecta) {
			System.out.println("¿Voy a aprobar el año que viene?");
			String respuesta = leerLinea.nextLine().trim();
			if (RESPUESTA_CORRECTA.toUpperCase().equals(respuesta.toUpperCase())) {
				esCorrecta = false;
				System.out.println("Yes, playa!");
			}else {
				System.out.println("\nQuiero que lo repitas hasta que la respuesta sea correcta\n");	
			}
		}
		leerLinea.close();
	}
}
