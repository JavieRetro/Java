package BuclesAnidados;
import java.util.Scanner;
public class BuclesFor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
		int n;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingresa un numero: ");
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
