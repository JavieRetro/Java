package EjArray;

public class EjArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numEnteros;
		int pares = 0, impares = 0;
		numEnteros = new int[8];
		
		for (int i = 0; i <= numEnteros.length; i++) {
			if (i % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			
		}
		System.out.println("Nº Pares: " + pares);
		System.out.println("Nº Impares: " + impares);;
		
	}

}
