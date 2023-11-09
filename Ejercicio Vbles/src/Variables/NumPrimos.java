package Variables;
import java.util.Scanner;
/**
 * 
 * @param args
 */
//usando un bucle while quiero que recorrer los 10.000 primeros
//y cuando detectemos un primo numero, 
//se imprima por pantalla.  Además imprimir que posicion de nº primo es
public class NumPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Mostrar vbles
		int i = 1;
		int contador = 1;
		
		while (i<=1000) {
			int esPrimo = 1;
			
			for(int h = 1; h*h <= i; h++) {
				if (i%h == 0) {
					esPrimo = 0;
					break;
				}
				
			}
			if(esPrimo == 1) {
				System.out.println("El numero" + i + "esta en la posicion" + contador );
				contador++;
				
			}
		}

	}

}
