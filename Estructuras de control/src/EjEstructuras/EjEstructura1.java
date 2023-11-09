package EjEstructuras;
import java.util.Scanner;

public class EjEstructura1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
System.out.print("Ingrese su calificación del examen: ");
  int calificacion = sc.nextInt();
  if (calificacion >= 60) {
	  System.out.println ("Aprobado");
	  
  } else {
	  System.out.println ("Suspenso");
	  }
	  
  }
	}


