package String_Char;
import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insertamos vbles
	    Scanner scanner = new Scanner (System.in);
	    String palabra;
	    boolean esPalindromo = true;
	    
	    //Introducimos una palabra
	    System.out.print("Escribe una palabra: ");
	    palabra = scanner.nextLine();
	    
	    //Introducimos el for para dar lugar al palindromo
	    palabra = palabra.toLowerCase();
	    for (int i = 0; i < palabra.length() / 2; i++) {
	    	if (palabra.charAt(i) != palabra.charAt(palabra.length()- i - 1)) {
	    		esPalindromo = false;
	    		break;
	    	}	
	    		
	    }
	    if (esPalindromo) {
	    	System.out.println("la palabra es un palindromo");
	    }else {
	    	System.out.println("No es un palindromo");
	    }

	}

}
