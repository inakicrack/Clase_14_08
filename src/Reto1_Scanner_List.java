
public class Reto1_Scanner_List {

	public static void main(String[] args) {
		BaseDeDatosDePreguntasList2 base_1 = new BaseDeDatosDePreguntasList2();
		ConjuntoDePreguntasList2 conj_1 = new ConjuntoDePreguntasList2();
		ConjuntoDePreguntasList2 conj_2 = new ConjuntoDePreguntasList2();
		ConjuntoDePreguntasList2 conj_3 = new ConjuntoDePreguntasList2();
		Pregunta nuevaPreg = new Pregunta("¿Voy a aprobar el año que viene?", "SI");
		conj_1.add(nuevaPreg);
		nuevaPreg = new Pregunta("¿Va a ser difícil el año que viene?", "NO");
		conj_1.add(nuevaPreg);
		nuevaPreg = new Pregunta("¿Vamos a por todas?", "SI");
		conj_1.add(nuevaPreg);

		nuevaPreg = new Pregunta("¿Hay ganas de empezar el año?", "SI");
		conj_2.add(nuevaPreg);
		nuevaPreg = new Pregunta("¿Estás seguro?", "SI");
		conj_2.add(nuevaPreg);
		
		nuevaPreg = new Pregunta("¿Hace calor?", "SI");
		conj_3.add(nuevaPreg);
		
		base_1.add(conj_1);
		base_1.add(conj_2);
		base_1.add(conj_3);
		
		base_1.preguntarLista();
	}
}
