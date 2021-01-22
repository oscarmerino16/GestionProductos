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
	
	
	public static void main(String[] args) {
		
		Curso c = new Curso("1º DAW", "José Micolau");
		int cond = 0;
		
		do {

			switch (pintaMenu()) {
			case 1:Curso.nuevoModulo();

				break;
			case 2:
				Scanner ler = new Scanner(System.in);
				System.out.println(c.toString());
				System.out.println("Pulse cualquier tecla para salir de ver todos los modulos");
				String a; 
				a = ler.next();
				break;
			case 3:
				

				break;
			case 4:
				cond = 1;

				break;

			default:
				break;
			}
		} while (cond != 1);
		
		
		
	}

}
