//Autor: I�aki
//Fecha: 18/08/2021
//Excepci�n que vamos a usar para cuando nuestro array al que queremos aa�dir preguntas est� lleno

package MisExcepciones;

public class ArrayEstaLlenoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayEstaLlenoException(String msg) {
		super(msg);
	}
}
