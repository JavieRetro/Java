import java.util.Scanner;
public class EjEstructuras2_8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Mostrar vbles
		int num;
		int contador = 0;
		//Ingresamos un numero
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingresa un numero: ");
		num = scanner.nextInt();
		/*Si el numero es mayor de 0, al dividir entre diez el nº de digitos aumentara*/
		while (num > 0) {
			num /=10;
			contador++;
			System.out.println("Este numero tiene " + contador + " digitos ");
			
		}
		
		
  }
}
