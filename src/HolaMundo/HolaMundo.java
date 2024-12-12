package HolaMundo;
import java.util.Scanner;
public class HolaMundo {
	/* Lo que hace el programa es pedirte de ingresar tu nombre,
	 * Cuando ya añadiste tu nombre, se guarda en la variable "nombre"
	 * Para luego expulsar el comando dandote la bienvenida con el mismo nombre que has puesto
	 * 
	 * @autor Adrian Avila
	 * @version 1.2
	 */
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Pide tu nombre
		System.out.print("Ingresa tu nombre: ");
		
		//envio y guardado de texto a variable nombre
		String nombre = scanner.nextLine();
		
		//Ejecuta la bienvenida con el nombre añadido anteriormente
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
		
	}
}
