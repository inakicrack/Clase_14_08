
public class Reto1_Scanner_List {

	public static void main(String[] args) {
		//Reto1_Scanner_List.ejemplo_01();
		//Reto1_Scanner_List.paso_referencia();
		Reto1_Scanner_List.queEsEsto();
	}
	
	public static void ejemplo_01 () {
		BaseDeDatosDePreguntasList3 base_1 = new BaseDeDatosDePreguntasList3();
		ConjuntoDePreguntasList3 conj_1 = new ConjuntoDePreguntasList3();
		ConjuntoDePreguntasList3 conj_2 = new ConjuntoDePreguntasList3();
		ConjuntoDePreguntasList3 conj_3 = new ConjuntoDePreguntasList3();
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
	
	public static void paso_referencia () {
		Proporcion prop1 = new Proporcion(0,0);
		Proporcion prop_clone = prop1.clone();
		Reto1_Scanner_List.auxiliar_01(prop_clone);
		System.out.println(prop1);
	}
	
	public static void auxiliar_01 (Proporcion prop) {
		prop.setRespuestasAcertadas(3);
		prop.setPreguntasTotales(10);
	}
	
	public static void queEsEsto() {
		String[] nombre = {"María", "López", "Obrador"};
		String cadena = "";
		String valor1 = nombre[1];
		String valor2 = nombre[2];
		
		for(int i = 0; i < nombre.length; i++) {
			cadena = cadena + " " + nombre[i];
		}
		
		nombre[1] = valor2;
		nombre[2] = valor1;
		cadena = cadena + "\n";
		
		for(int i = 0; i < nombre.length; i++) {
			cadena = cadena + " " + nombre[i];
		}
		System.out.println(cadena);
	}
}

