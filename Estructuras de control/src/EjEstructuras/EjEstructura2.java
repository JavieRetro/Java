package EjEstructuras;
import java.util.Scanner;

public class EjEstructura2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("El numero es positivo");
		} else if(numero < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println ("El numero es cero");
			
		
	}
	}

}
