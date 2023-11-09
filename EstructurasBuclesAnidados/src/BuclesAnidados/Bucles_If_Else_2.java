package BuclesAnidados;
import java.util.Scanner;
public class Bucles_If_Else_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostrar vbles
		Scanner scanner = new Scanner (System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = scanner.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2 = scanner.nextInt();
		System.out.print("Introduce el tercer numero: ");
		int num3 = scanner.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("El mayor es el " + num1);
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("El mayor es el " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("El mayor es " + num3);
			}else if(num1 == num2 && num2 == num3) {
				System.out.println("Ninguno es el mayor, cambia los valores");
			}
		
		

	}

}
