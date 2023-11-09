package EjEstructuras;
import java.util.Scanner;

public class EjEstructuras10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insertar vbles
		        Scanner scanner = new Scanner (System.in);
		        //Insertar un valor num al scanner
				System.out.print("Ingresar un numero:");
				int num = scanner.nextInt();
				/*Hacemos uso del for para presentar el valor i y para obtener los valores 
				 descendentes desde num hasta el valor i=1 usando i-- en vez de i++*/
				
				for (int i = num; i>=1; i--) {
			
				System.out.println(i);
				}
	}

}
