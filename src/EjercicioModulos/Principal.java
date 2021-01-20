package EjercicioModulos;

/**
 * 
 * @author Oscar Merino
 * @version 1.0
 */

public class Principal {

	public static void main(String[] args) {
		
		Modulo m = new Modulo("Programación", "PRG", 300);
		
		System.out.println(m.toString());
		System.out.println("Numero de horas del ciclo: " + m.getNumHoras());

	

	}

}
