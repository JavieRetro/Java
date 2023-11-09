package EjEstructuras;
import java.util.Scanner;

public class EjEstructuras8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Insertar vbles
		
		Scanner scanner = new Scanner (System.in);
		//Insertar un numero
		System.out.print("Inserta un numero: ");
		
		int n = scanner.nextInt();
		
		//Hacemos uso de la estructura for
		for (int i=1; i<=10; i++) {
			
			
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		
	}

}
