package BuclesAnidados;
import java.util.Scanner;
public class Bucles_If_Else_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostrar vbles
		int num1, num2, num3;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Introduce el primer numero: ");
		num1 = scanner.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2 = scanner.nextInt();
		System.out.print("Introduce el tercer numero: ");
		num3 = scanner.nextInt();
		
		if (num1 <= num2 && num2 <= num3) {
			System.out.println("Está en orden creciente");
		}else if(num3 <= num2 && num2 <= num1) {
			System.out.println("Está en orden decreciente");
		}else {
			System.out.println("No esta ni en orden creciente y decreciente");
		}

	}

}
