import java.util.Scanner;

public class Reto1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Scanner leerLinea = new Scanner(System.in);
	final String RESPUESTA_CORRECTA = "Si";
	
	System.out.println("¿Voy a aprobar el año que viene?");
	String respuesta = leerLinea.nextLine().trim();
	if (RESPUESTA_CORRECTA.toupper().equals(respuesta.toupper)) {
		
	}
	
}
