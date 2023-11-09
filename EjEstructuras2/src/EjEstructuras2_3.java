import java.util.Scanner;
public class EjEstructuras2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
		
		double cantidad;
		char monedas;
		//Ingresamos la cantidad
		Scanner scanner = new Scanner(System.in);
				System.out.print("Escribe la cantidad que quieras usar: ");
		cantidad = scanner.nextDouble();
		
		
		//Indica a que vas a convertir las monedas que vas a usar
		System.out.println("¿Vas a pasar las monedas a euros o dolares?");
		monedas = scanner.next().charAt(0);
		
		switch (monedas) {
		case ('E'):
			cantidad = cantidad / 1.06;
		System.out.println("La cantidad de monedas en dolares es de " + cantidad + " $ ");
		break;
		case ('D'):
			cantidad = cantidad * 1.06;
			System.out.println("La cantidad de monedas en euros es de " + cantidad + " euros");
		default:
		}
    }
}