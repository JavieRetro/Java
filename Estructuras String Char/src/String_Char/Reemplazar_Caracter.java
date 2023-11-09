package String_Char;
import java.util.Scanner;
public class Reemplazar_Caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingresar las vbles
		Scanner scanner = new Scanner (System.in);
		String cadena;
		char caracterBuscar;
		char caracterReemplazar;

		//Ingresamos la cadena y los caracteres a reemplazar
		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();
		
		System.out.print("Introduce el caracter a buscar: ");
		caracterBuscar = scanner.next().charAt(0);
		
		System.out.print("Introduce el caracter: ");
		caracterReemplazar = scanner.next().charAt(0);
		
		//Reemplazamos los caracteres que buscamos de la cadena por el reemplazo
		cadena = cadena.replace(caracterBuscar, caracterReemplazar);
		System.out.println("La cadena resultante es :" + cadena);
		
	}

}
