package EjercicioModulos;

import java.util.Scanner;

/**
 * 
 * @author Oscar Merino
 * @version 1.0
 */

public class Principal {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nombre="", siglas="";
		int horas=0, aux=0;
		
		
		Modulo vModulos[] = new Modulo[10];
		
		
		
		vModulos[0]= new Modulo("Bases de Datos", "BBDD", 250);
		
		vModulos[1]= new Modulo("Sistemas Informaticos", "SI", 200);
		
		vModulos[2]= new Modulo("Programacion", "PRG", 300);
		
		/*for (int i = 0; i < vModulos.length; i++) {
			
			if (vModulos[i]!=null) {
				System.out.println(vModulos[i]);
			}
			
		}*/
		for (Modulo m : vModulos) {
			if (m!=null) {
				aux+=m.getNumHoras();
				System.out.println(m);
			}
			
		}
		System.out.println("Numero de horas totales: " + aux);
		
		
	}

}
