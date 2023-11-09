import java.util.Scanner;
public class EjEstructuras2_11Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles y pedimos al usuario que ingrese un numero
		int num;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un numero para calcular la suma de los pares: ");
		 num = scanner.nextInt();
		
		
		int i = 2;
		do {
			//Sumamos el nº actual
			suma = suma + i;
			//Incrementamos el contador
			i = i + 2;
		}while (i <= num);
		
		System.out.println("La suma de los nº pares desde 2 hasta " + num + " es " + suma);
    }
}
