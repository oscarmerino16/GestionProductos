package EjercicioModulos;

import java.util.Scanner;

/**
 * 
 * @author Oscar Merino
 * @version 1.0
 */


	public class Principal {
		
	public static int pintaMenu() {
		
		Scanner leer = new Scanner(System.in);
		
		int num=0;
		
		do {
			
				System.out.println("1- Introduce nuevo modulo");
				System.out.println("2- Consultar modulos");
				System.out.println("3- Consultar horas curso");
				System.out.println("4- Salir");
				try {
					num= leer.nextInt();
				} catch (Exception e) {
					num =0;
					leer = new Scanner(System.in);
					System.out.println("Opcion invalida");
				}
				
		} while (num <1 || num>4);
		
			return num;
	}	
	
	/*public static void añadirModulo() {
		
		for (int i = 0; i <i .length; i++) {
			
		}
		
		
	}*/

	public static void main(String[] args) {
		
	
		pintaMenu();
		
		
		
	}

}
