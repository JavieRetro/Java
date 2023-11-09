import java.util.Scanner;
public class EjEstructuras2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
		
		int menu;
		int opcion;
		//Nos metemos en el menu
		System.out.println("Menu");
		System.out.println("1. Mostrar información");
		System.out.println("2. Editar perfil");
		System.out.println("3. Salir");
		//Nos metemos en un menu y elegimos una opción
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese la opcion deseada");
		opcion = scanner.nextInt();
		
		switch (opcion){
		
		case 1:
			System.out.println("Mostrar informacion: ¿Que tipo de informacion quieres ver?");
			break;
		case 2:
			System.out.println("Editar perfil: ¿Seguro que quiere activar la edicion?");
			break;
		case 3:
			System.out.println("Salir: Por favor espere un momento...");
			default:
		}
	}
}
