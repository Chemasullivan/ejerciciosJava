package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio1v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("introduce un numero del 1 al 10");
			numero = sc.nextInt();
			
		}
		while(numero<1 || numero>10);
		System.out.println("Ha terminado el programa con el numero " + numero);
		sc.close();
	}

}
