package String_Char;
import java.util.Scanner;
public class ContarA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostrar las vbles
		Scanner scanner = new Scanner (System.in);
		String cadena;
		int contador = 0;
		//Ingresamos la cadena de texto
		System.out.print("Ingresamos una cadena de texto: ");
		cadena = scanner.nextLine();
		
		//Recorremos la cadena, caracter a caracter
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			//Si el caracter es A o a, aumentamos el contador
			if(cadena.charAt(i) == 'a'|| cadena.charAt(i) == 'A') {
			contador++;
			
			
			
		}
       
	}
       System.out.println("La cadena tiene " + contador + " letras a en total");
  }
}
