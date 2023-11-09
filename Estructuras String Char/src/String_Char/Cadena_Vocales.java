package String_Char;
import java.util.Scanner;
public class Cadena_Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Indicar las vbles
		Scanner scanner = new Scanner(System.in);
		String cadena;
		int contador = 0;
		
		//Ingresamos una cadena
		System.out.print("Ingresamos una frase: ");
		cadena = scanner.nextLine();
		//Incluimos un valor i para recorrer la cadena de caracteres
		for (int i = 0; i < cadena.length(); i++) {
			//Si el caracter es una vocal en minuscula, aumenta el contador 
			switch (cadena.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				contador++;
			}
			
		}
		System.out.println ("Tenemos un nº de " + contador + " vocales");
	}

}
