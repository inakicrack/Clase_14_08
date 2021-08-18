//Autor: Iñaki
//Fecha: 18/08/2021
//Excepción que vamos a usar para cuando nuestro array al que queremos aañdir preguntas esté lleno

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
