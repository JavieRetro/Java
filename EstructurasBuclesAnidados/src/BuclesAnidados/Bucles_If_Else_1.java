package BuclesAnidados;
import java.util.Scanner;
public class Bucles_If_Else_1 {

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		//Mostar vbles
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingresa lo que mide el primer lado: ");
		int l1 = scanner.nextInt();
		System.out.print("Ingresa lo que mide el segundo lado: ");
		int l2 = scanner.nextInt();
		System.out.print("Ingresa lo que mide el tercer lado: ");
		int l3 = scanner.nextInt();
		
		if (l1 == l3 && l2 == l3) {
			System.out.println(" El trinagulo es equilatero");
			
		}else if(l1 == l2 && l1 != l3) {
			System.out.println("El triangulo es isósceles");
		}else if(l1 != l2 && l2 != l3) {
			System.out.println("El triángulo es escaleno");
		}
	}
}
