package MisExcepciones;

public class NoSeEncuentraConjunto extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSeEncuentraConjunto(String msg) {
		super(msg);
	}
}