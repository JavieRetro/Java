	import java.util.Scanner;
public class EjEstrucrtura2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
			Scanner scanner= new Scanner (System.in);
			System.out.print("Ingresa un dia del 1 al 7: ");
			int dia = scanner.nextInt();
			switch (dia) {
				case 1:
					System.out.println("Lunes");
				break;
				case 2: 
					System.out.println("Martes"); 
				break;
				case 3:
					System.out.println("Miercoles");
				break;
				case 4: 
					System.out.println("Jueves");
				break;
				case 5: 
					System.out.println("Viernes");
				break; 
				case 6: 
					System.out.println("Sábado");
				break;
				case 7:
					System.out.println("Domingo");
				default:
			}
			
	}

}
