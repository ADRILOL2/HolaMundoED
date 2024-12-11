package HolaMundo;
import java.util.Scanner;
public class HolaMundo {

	public static void main(String[] args) {
		//Lo que hace este programa solo te pide el nombre para luego
		//Darte la bienvenida con el nombre que tu mismo le has puesto
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
	}
}