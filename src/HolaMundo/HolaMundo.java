package HolaMundo;
import java.util.Scanner;
public class HolaMundo {

	public static void main(String[] args) {
		//Cambio realizado desde rama Desarrollo
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
	}
}
