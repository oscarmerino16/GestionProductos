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
		}
		

		public static void main(String[] args) {
		Curso c = new Curso("1º DAW", "José Micolau");
		int opc = 0;
		

		do {
			opc = pintaMenu();
			
			switch (opc) {
			case 1:
				c.addModulo();
				break;
			case 2:
				System.out.println(c.toString());
				break;
			case 3:
				System.out.println("El total de horas lectivas del curso es de "+c.horasYear()+" horas");
				break;
			case 4:
				c.eliminarModulo();
				break;
			case 5:
				System.out.println("Bye");
				System.exit(0);
				break;
			}
		} while (opc!=5);
		
		
		
	}

}
