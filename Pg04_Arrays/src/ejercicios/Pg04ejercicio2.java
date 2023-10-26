package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] numeros = new int [10];
		int numeroMayor, numeroMenor, contadorMayor=0, contadorMenor=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("introduce la " + i + " posicion");
			numeros [i] = sc.nextInt();
			}
		numeroMayor=numeros[0]; numeroMenor=numeros[0];
		for (int i=0; i<10; i++) {
			if (numeros [i] > numeroMayor) 
				numeroMayor=numeros[i];
			if (numeros[i] < numeroMenor)
				numeroMenor=numeros[i];
			}
		for (int i=0; i<10; i++) {
			if (numeros[i] == numeroMayor) contadorMayor++;
			if (numeros[i] == numeroMenor) contadorMenor++;
		}
		System.out.println("Hay del mayor " + contadorMayor + " numeros del " + numeroMayor + "\nHay del menor " + contadorMenor + " numero del " + numeroMenor);
	sc.close();
	}

}
