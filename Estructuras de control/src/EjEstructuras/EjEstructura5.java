package EjEstructuras;
import java.util.Scanner;

public class EjEstructura5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar variables
		Scanner scanner = new Scanner(System.in);
		int numero;
		int minimo = 1;
		int maximo = 100;
		//Pide al usuario que ingrese un nº
		System.out.print("Ingrese un numero: ");
		numero = scanner.nextInt();
		//Verifica que el nº esta dentro del rango.
		if (numero >= minimo && numero <=maximo) {
 			System.out.println("El numero esta dentro del rango.");
		}else{
 		   System.out.println("El numero esta fuera del rango.");
 			}
 			}
		}
		

	


