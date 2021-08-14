import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		Scanner leerLinea = new Scanner(System.in);
		final String RESPUESTA_CORRECTA = "SI";
		
		System.out.println("¿Voy a aprobar el año que viene?");
		String respuesta = leerLinea.nextLine().trim();
		if (RESPUESTA_CORRECTA.toUpperCase().equals(respuesta.toUpperCase())) {
			System.out.println("Yes, playa!");
		}else {
			System.out.println("Payaso!! Revisa las evidencias!!");
		}
	}	
}
