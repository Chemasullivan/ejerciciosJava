package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio2v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroPositivo = 0;
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			if (numero>0) numeroPositivo++;
		}
		System.out.println("Hay " + numeroPositivo + " numeros positivos");
	sc.close();
	}

}
