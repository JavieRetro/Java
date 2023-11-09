package EjEstructuras;

import java.util.Scanner;

public class EjEstructuras6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducir variables
		Scanner scanner = new Scanner(System.in);
	int n;
	//Ingresamos un nº
	System.out.print("Ingresa un numero: ");
	n = scanner.nextInt();
	//Obtenemos los numeros desde 1 hasta N
	for(int i =1; i<=n; i++) {
		System.out.println(i);
	}

}
}
