import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		Scanner leerLinea = new Scanner(System.in);
		boolean esCorrecta = true;
		
		while (esCorrecta) {
			System.out.println(pregunta);
			String respuestaDelUsuario = leerLinea.nextLine().trim();
			if (respuesta.equals(respuestaDelUsuario.toUpperCase())) {
				esCorrecta = false;
				System.out.println("Yes, playa!");
			}else {
				System.out.println("\nQuiero que lo repitas hasta que la respuesta sea correcta\n");	
			}
		}
		leerLinea.close();
	}
}
