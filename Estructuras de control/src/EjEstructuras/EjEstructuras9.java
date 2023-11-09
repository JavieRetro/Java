package EjEstructuras;
import java.util.Scanner;

public class EjEstructuras9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Introducir vbles
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		int n = scanner.nextInt();
		if (n < 1) {
			System.out.println("El numero ingresado no es positivo");
		} else {
			int factoral = 1;
			int i;
			for (i = 1; i <=n; i++) {
				factoral = factoral *i;
			}
			System.out.println("El factorial de " + n+ " es  = " + factoral);
		}
	}

}
