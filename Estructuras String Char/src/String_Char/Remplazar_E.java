package String_Char;
import java.util.Scanner;
public class Remplazar_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar las vbles
		Scanner scanner = new Scanner (System.in);
		String cadena;
		//Ingresamos la cadena
		System.out.print("Ingresamos una frase: ");
		cadena = scanner.nextLine();
		
		//Remplazamos la letra e por la x
		cadena = cadena.replace("e","x");
		//Imprimimos la nueva cadena.
		System.out.println("La nueva cadena es: " + cadena);

	}

}
