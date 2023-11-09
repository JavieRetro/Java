package BuclesAnidados;
import java.util.Scanner;
public class BuclesFor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Mostrar vbles
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		num = scanner.nextInt();
		
		for(int i = 1; i <=num; i++) {
			
		
		for(int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println();
	   }
	}

}
