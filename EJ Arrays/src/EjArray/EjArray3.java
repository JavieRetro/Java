package EjArray;

public class EjArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numAleatorios;
		numAleatorios = new int[8];
		
		//Nº aleatorios para el array
		for (int i = 0; i < numAleatorios.length; i++) {
			numAleatorios[i] = (int) (Math.random()* 100);
			System.out.println( numAleatorios[i]);
		}
		//Inicializar el num mayor
		int mayor = numAleatorios[0];
		//Recorrer array buscando un valor mayor
		for (int numero: numAleatorios) {
		if (numero > mayor) {
			mayor = numero;
		}
	  }
		System.out.print("El numero mas grande de array es: " + mayor);

	}

}
