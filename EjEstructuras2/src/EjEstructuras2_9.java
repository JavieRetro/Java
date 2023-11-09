import java.util.Random;
import java.util.Scanner;
//Tenemos que adivinar el numero aleatorio
public class EjEstructuras2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostrar vbles
		Random random = new Random();
		int aleatorio = random.nextInt(101);
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingresa un numero aleatorio entre 1 y 100: ");
		
		int num = scanner.nextInt();
			
			if (aleatorio < num) {
				System.out.println("El num secreto es mayor");
			}
			else if (aleatorio > num) {
				System.out.println ("El num secreto es menor");		
			}
			while (num == aleatorio) {
			
		}
		
		
		
		

	}

}
