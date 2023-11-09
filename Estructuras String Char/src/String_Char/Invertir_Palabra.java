package String_Char;
import java.util.Scanner;
public class Invertir_Palabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Integrar vbles
		Scanner scanner = new Scanner(System.in);
		String palabra;
		
		//Ingresamos la palabra
		System.out.print("Introduce una palabra: ");
		palabra = scanner.nextLine();
		
		//Invertir la palabra
		String palabraInvertida = "";
		for(int i = palabra.length() - 1; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}
		System.out.println ("La palabra invertida de" + palabra + " es " + palabraInvertida);
	}

}
