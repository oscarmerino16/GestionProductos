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
	

	public void addModulo(){
		for (int i = 0; i < vModulos.length; i++) {
			
			String nombre="", codigo="";
			int numHoras=-99;
			Scanner leerTxt = new Scanner(System.in);
			Scanner leerNum = new Scanner(System.in);
			
			if (vModulos[i]==null) {
				System.out.println("Dime el nombre del nuevo modulo");
				nombre = leerTxt.nextLine();
				System.out.println("Dime el codigo del nuevo modulo");
				codigo = leerTxt.nextLine();
				System.out.println("Dime las horas que durara el nuevo modulo");
				do {
					try {
						numHoras = leerNum.nextInt();
					} catch (Exception e) {
						numHoras=-99;
						leerNum = new Scanner(System.in);
						System.out.println("Introduzca un valor numerico por favor (y que sea mayor que 0)");
					}
					if (numHoras<=0) {
						System.out.println("Introduzca un numero de horas valido por favor (minimo debe ser mayor que 0)");
					}
				} while (numHoras<=0);
				
				vModulos[i]= new Modulos(nombre, codigo, numHoras);
				System.out.println("modulo a�adido correctamente");
				break;
			}
		}
		
	}

public int horasYear() {
		
		int horasTotales=0;
		
		for (Modulos m : vModulos) {
			if (m!=null) {
				
				horasTotales+=m.getNumHoras();
			}
			
			
		}
		
		return horasTotales;
	}

	public void eliminarModulo() {
	Scanner leer = new Scanner(System.in);
	String comprobacion ="";
	boolean bandera = false;
	
	System.out.println("dime el codigo del modulo que quieres eliminar");
	for (Modulos m : vModulos) {
		if (m!=null) {
			System.out.println(m.getNombre()+"------- codigo del modulo: "+m.getCodigo());
		}
	}
	
	System.out.println("\n dime el codigo del modulo que quieras eliminar");
	comprobacion = leer.nextLine();
	
	for (int i = 0; i < vModulos.length; i++) {
		if (vModulos[i]!=null && vModulos[i].getCodigo().equalsIgnoreCase(comprobacion)) {
			vModulos[i] = null;
			bandera = true;
		}
	}
			
	if (bandera==false) {
		System.out.println("No habia ningun modulo que se podia eliminar");
	} else {
		System.out.println("Un modulo ha sido eliminado");
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
	
	
	

