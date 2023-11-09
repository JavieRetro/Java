import java.util.Scanner;
public class EjEstructuras2_10Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Indicar vbles
		Scanner scanner = new Scanner (System.in);
		System.out.print("Introduce un numero: ");
		int num = scanner.nextInt();
		
		//Hacemos uso del do-while
		int i = 1;
		do { 
			
			System.out.println("La tabla de multiplicar de " + num + " es: " + num + " * " + i + " = " + num * i);
		
		i++;
		
	} while ( i <= 10);

  }

}