package HolaMundo;
import java.util.Scanner;
public class HolaMundo {

	public static void main(String[] args) {
		//Lo que hace el programa es solo añadir tu nombre y luego lo ejecuta una bienvenida con el nombre ya puesto
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
	}
}
