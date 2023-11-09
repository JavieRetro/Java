import java.util.Scanner;
public class EjEstructuras2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
		int num1;
		int num2;
		char operador;
		Scanner scanner = new Scanner (System.in);
		//Expresamos los valores y el operador
		System.out.println("Escribe el primer numero: ");
		num1 = scanner.nextInt();
		System.out.println ("Escribe el segundo numero: ");
		num2 = scanner.nextInt();
		System.out.println("Escribe un operador (+, -, *, /): ");
		operador =  scanner.next().charAt(0);
		
		switch (operador) {
		
		case '+':
			 System.out.println("El resultado es: " + num1 + " + " + num2 + " = "+ (num1 + num2));
			break;
		case '-':
			System.out.println("El resultado es: " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println("El resultado es: " + num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println("El resultado es: " + num1 + " / " + num2 + " = " + (num1 / num2));
			default:
				System.out.println(" El operador no es válido ");
		}
		
		System.out.println("Resultado: " + operador);
		

	}

}
