package EjEstructuras;
import java.util.Scanner;
public class EjEstructuras7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indicar vbles
	Scanner scanner= new Scanner (System.in);
	
	System.out.print("Introduce un numero: ");
	int n = scanner.nextInt();
	//Hacemos uso del metodo for y planteamos la suma de los nº
	int suma = 0;
	
	for (int i = 1; i<=n; i++) {
		
		if(i%2==0) {
			suma= suma + i;
		}
		
		
	}
	//Tras hacer las operaciones determinadas sacamos el resultado
	System.out.println("La suma de los numeros pares desde 1 hasta " + n + " es " + suma);
	}
}