package EjArray;
import java.util.Random;
import java.util.Scanner;

public class EjArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PARA GENERAR ARRAYS RANDOMS
		
		/*Random r1 = new Random();
		 * int[] array = new int[10];
		 * for (int i = 0; i < array.length; i++){
		 * array[i] = r1.nextInt (1, 100);
		 * }*/
		int[] array = new int[]  {51, 26, 78, 87, 65};
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce un numero a ver si esta en el array :)");
		int num1 = scanner.nextInt();
		int posicion = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num1) {
				posicion = i;
				System.out.println("El valor " + num1 + "esta en el arrays, en la posicion: " + posicion);
				
			}
			
		}
		if(posicion < 0) {
			System.out.println("El valor ha sido encontrado");
       }
    }
 }
