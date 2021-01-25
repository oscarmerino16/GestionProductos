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
	
<<<<<<< Updated upstream
	
	public static void main(String[] args) {
=======
	public static void a�adirModulo(String vModulos[]) {
		Scanner leer = new Scanner(System.in);
		String nombre, siglas;
		int horas;
		
		for (int i = 0; i <vModulos .length; i++) {
			
			System.out.println("Dime el nombre del nuevo modulo");
			nombre=leer.next();
			System.out.println("Dime las siglas del nuevo modulo");
			siglas=leer.next();
			System.out.println("Dime el numero de horas del nuevo modulo");
			horas=leer.nextInt();
			
			vModulos[i]=nombre+siglas+horas;
		}
>>>>>>> Stashed changes
		
		Curso c = new Curso("1º DAW", "José Micolau");
		int cond = 0;
		
<<<<<<< Updated upstream
		do {
=======
	}
>>>>>>> Stashed changes

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
