package BuclesAnidados;
import java.util.Scanner;
public class BuclesFor_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostar vbles
		int num;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingresamos un numero: ");
		num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++){
				System.out.print( i*j);
				
			}
			System.out.println();
			
		}
	}

}
