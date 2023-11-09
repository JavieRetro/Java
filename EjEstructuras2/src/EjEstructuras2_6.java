import java.util.Scanner;
public class EjEstructuras2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Mostrar vbles
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe un numero: ");
		n = scanner.nextInt();
	//Introducimo una vble i y hacemos uso del while
		int i = 1;
		//Mientras i sea menor que n seguiremos imprimiendo
		//numeros y aumentando el contador
		while (i <= n) {
			System.out.println(i);
			i++;
	}

  }
}
