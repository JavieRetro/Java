import java.util.Scanner;
public class EjEstructuras2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
		int calificacion;
		//Ingresamos la calificación
		Scanner scanner = new Scanner (System.in);
		System.out.print("Establece una calificacion numerica del 1 al 5: ");
		calificacion = scanner.nextInt();
		
		switch(calificacion) {
		case 1:
			System.out.println("Suspenso");
			break;
		case 2:
			System.out.println("Deficiente");
			break;
		case 3:
			System.out.println("Bien");
			break;
		case 4:
			System.out.println("Notable");
			break;
		case 5:
			System.out.println("Sobresaliente");
			default:
		}
	}

}
