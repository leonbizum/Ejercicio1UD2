package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un nombre: ");
		String nombre = entrada.nextLine();
		System.out.print("Dame un apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println(nombre + " " + apellido);
	}

}
