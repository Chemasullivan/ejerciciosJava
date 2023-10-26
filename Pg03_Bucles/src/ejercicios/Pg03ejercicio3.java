package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int positivo = 0;
		int negativo = 0;
		int nulo = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			if (numero < 0) {
				negativo++;
			} else if (numero == 0) {
				nulo++;
			} else {
				positivo++;
			}
		}
		System.out.println("Hay " + positivo + " numeros positivos" + "\nHay " + negativo + " numeros negativos"
				+ "\nHay " + nulo + " numeros nulos");
		sc.close();
	}

}
