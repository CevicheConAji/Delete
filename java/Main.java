package Ejer126;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList <Contenido> listaConte = new ArrayList <Contenido>();
		
		menu(listaConte);
	}
	
	public static void menu(ArrayList <Contenido> listaConte) {
		Scanner sc = new Scanner(System.in);
		boolean salir =	false;
		int opcion = 0;
		
		while(!salir) {
			System.out.println("-----------------------------");
			System.out.println("1-Dar de alta una película");
			System.out.println("2-Dar de alta una serie");
			System.out.println("3-Ver un contenido");
			System.out.println("4-Listar contenido");
			System.out.println("5-Listar contenido pendiente por ver");
			System.out.println("6-Salir");
			System.out.println("-----------------------------");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:altaPeli(listaConte);
				break;
			case 2:altaSerie(listaConte);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6: 
				salir =true;
				break;
			}
		}
		
	}

	public static void altaPeli(ArrayList <Contenido> listaConte) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca titulo de la pelicula:");
		String titulo = sc.nextLine();
		
		System.out.println("Introduzca productora de la pelicula:");
		String productor = sc.nextLine();
		
		System.out.println("Introduzca año de publicacion:");
		int anyoPubli = sc.nextInt();
		
		System.out.println("Número de nominaciones a los oscars:");
		int nominaciones = sc.nextInt();
		
		System.out.println("Número de oscars ganados:");
		int oscarswin = sc.nextInt();
		
		validarPeli(nominaciones, oscarswin);
		
		System.out.println("La pelicula "+titulo+" ha sido dada de alta correctamente!");
		
		Pelicula c1 = new Pelicula(titulo, productor, anyoPubli, false, nominaciones, oscarswin);	
		listaConte.add(c1);
	}
	
	public static void validarPeli(int nominaciones,int oscarswin) {
		Scanner sc = new Scanner(System.in);
		
		while(!(nominaciones >= oscarswin)) {
			
			System.err.println("ERROR! mas oscars ganados que nominaciones!");
			System.out.println("Numero de nominaciones a los oscars:");
			nominaciones = sc.nextInt();
			
			System.out.println("Numero de oscars ganados:");
			oscarswin = sc.nextInt();
			
			
		}
	}
	
	public static void altaSerie(ArrayList <Contenido> listaConte) {
		Scanner sc = new Scanner(System.in);
		
		String finalizada ="";
		
		System.out.println("Introduzca titulo de la serie:");
		String titulo = sc.nextLine();
		
		System.out.println("Introduzca productora de la serie:");
		String productora = sc.nextLine();
		
		System.out.println("Introduzca año de publicacion:");
		int anyopubli = sc.nextInt();
		
		System.out.println("Introduzca numero de temporadas:");
		int nTemp = sc.nextInt();
		
		validarSerie(titulo, nTemp);
		
		System.out.println("¿La serie está finalizada o no? (S/N)");
		finalizada = sc.nextLine();
		
		validarFinSerie(finalizada);
		
		System.out.println("La serie "+ titulo+" ha sido dada de alta correctamente!");
		
		
	
	}
	
	public static void validarSerie(String titulo,int nTemp) {
		Scanner sc = new Scanner(System.in);
		
		while(!(nTemp > 0)) {
			
			System.err.println("ERROR!, "+titulo+" debería tener, al menos 1 temporada!");
			System.out.println("Introduzca numero de temporadas:");
			
			nTemp = sc.nextInt();
		
			
		}
	}
	
	public static void validarFinSerie(String finalizada) {
		Scanner sc = new Scanner(System.in);
		
		while(!(finalizada.equalsIgnoreCase("s") || finalizada.equalsIgnoreCase("n"))) {
			
			System.out.println("¿La serie está finalizada o no? (S/N)");
			finalizada = sc.nextLine();
			
			
		}
		
	}
}
