package MisExcepciones;

public class FormatoDeFicheroIncorrecto extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormatoDeFicheroIncorrecto(String msg) {
		super(msg);
	}
}

