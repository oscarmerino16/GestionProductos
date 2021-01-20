package EjercicioModulos;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {

	private String nombre;
	private String tutor;
	private Modulos vModulos[];
	
	public Curso(String nombre, String tutor) {
		
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos= new Modulos[10];
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
	
	
	

