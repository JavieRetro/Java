package EjArray;
import java.util.Scanner;
import java.util.Random;

public class EjArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Escribe un programa que inserte un elemento en un  ́ındice determinado. Tanto el elemento como el  ́ındice se le
deben pedir al usuario. El array desplazar ́a todos los elementos hacia la derecha para poder insertar el nuevo
elemento, por lo que se eliminar ́a el  ́ultimo elemento del array.*/
		int tamaño = 10;
		int[] numEnteros = new int [tamaño];
		Random aleatorio = new Random();
		for (int i = 0; i < tamaño; i++) {
			numEnteros[i] = aleatorio.nextInt(20);
		}
		
		System.out.println("Arrays original: ");
		for (int numeros : numEnteros) {
		System.out.println(numeros + " ");
		}
		
		System.out.println("Introduce la posición del elemento del 0-9:");
		Scanner sc1 = new Scanner (System.in);
		int n1 = sc1.nextInt();
		
		System.out.println("Introduce el elemento a añadir: ");
		int n2 = sc1.nextInt();
		if (n1 >= 0 && n1 < tamaño ) { /* La posición que pongamos tiene que ser mayor e igual a 0 y menor que
		el tamaño del array*/
			for (int i = tamaño -1; i > n1; i--) { /*Bucle que se encarga de desplazar los elementos a la derecha empezando por el
			ultimo creando un espacio */
				numEnteros[i] = numEnteros[i-1];
				}
			
			numEnteros [n1] = n2; /*Poner el nuevo elemento n2 en la posicion definida n1 */
		
			}
		
		

		
		
	}

}
