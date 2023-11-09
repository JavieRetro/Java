package EjEstructuras;
import java.util.Scanner;

public class EjEstructura4 {
	public static void main(String[] args) {
		//Introducir las vbles
		Scanner scanner = new Scanner (System.in);
		System.out.print("Introduzca su año de nacimiento");
		int numero;
		int num1 = scanner.nextInt();
		int num2 = (2023 - num1);
		
		if (num1 <= 2023) {
			System.out.println ("Tienes una edad de " + num2 + " años" );
		} else {
			System.out.println ("No mientas que estas vivo");
			
		}
				
	}

}