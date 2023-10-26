package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int contador = 0;
		int numerosPositivos = 0;
		while (contador < 5) {
			System.out.println("introduce un numero:");
			numero = sc.nextInt();
			if (numero > 0) {
				numerosPositivos++;
			}
			contador++;
		}

		System.out.println("Hay " + numerosPositivos + " numeros positivos");
		sc.close();
	}
}
