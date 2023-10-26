package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Pg03ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int numeroAleatorio=1; int positivo=0; int negativo=0;
		int min = -20; int max = 20;
		Random random = new Random();
		while(numeroAleatorio != 0) {
			System.out.println("introduzca un numero: ");
			numeroAleatorio = random.nextInt(max - min +1) + min;
			System.out.println(numeroAleatorio);
			if (numeroAleatorio < 0) positivo++;
			else negativo++;
		}
		System.out.println("Hay " + positivo + " numeros positivos" + "\nHay " + negativo + " numeros negativos");
		sc.close();
	}

}
