package EjercicioModulos;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {

	private String nombre;
	private String tutor;
	private static Modulos vModulos[];
	
	public Curso(String nombre, String tutor) {
		
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos= new Modulos[10];
	}
	

	public static void nuevoModulo() {
		Scanner leer = new Scanner(System.in);
		String nueModulo = "";
		String nueCodigo = "";
		int nueHoras = 0;
		int totalHoras = 0;

		System.out.println("Dime el nombre del nuevo modulo:");
		nueModulo = leer.next();
		System.out.println("Dime el codigo del nuevo modulo:");
		nueCodigo = leer.next();
		System.out.println("Dime cuantas horas tiene el modulo:");
		nueHoras = leer.nextInt();
		for (int i = 0; i < vModulos.length; i++) {
			if (vModulos[i] == null) {
				vModulos[i] = new Modulos(nueModulo, nueCodigo, nueHoras);
				totalHoras = totalHoras + nueHoras;
				break;
			}
		}
		for (int j = 0; j < 10; j++) {
			System.out.println("\n");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Modulos[] getvModulos() {
		return vModulos;
	}

	public void setvModulos(Modulos[] vModulos) {
		this.vModulos = vModulos;
	}

	@Override
	public String toString() {
		
		String datos="";
		
		for (Modulos modulo : vModulos) {
			if (modulo!=null) {
				datos+=modulo.toString() + "\n";
			}
		}
		
		return nombre + "\n" + tutor + "\nModulos\n----------\n" + datos;
	}
	
	
	
	
}
	
	
	

