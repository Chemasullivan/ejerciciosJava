package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] numeros = new int [2][3];
		for(int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("introduce un numero:");
				numeros [i][j] = sc.nextInt();
			}
		}
		int numeroMayor=numeros[0][0], numeroMenor=numeros[0][0];
		int posicionMaxI=0, posicionMaxJ=0, posicionMinI=0, posicionMinJ=0;
		for (int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if (numeros[i][j] > numeroMayor) {numeroMayor=numeros[i][j]; posicionMaxI= i; posicionMaxJ= j;}
				if (numeros[i][j] < numeroMenor) {numeroMenor=numeros[i][j];  posicionMinI= i; posicionMinJ= j;}
		}
}
		System.out.println("El valor Maximo es : " + numeroMayor + " y esta en la posicion " + posicionMaxI + " " + posicionMaxJ);
		System.out.println("El valor Minimo es : " + numeroMenor + " y esta en la posicion " + posicionMinI + " " + posicionMinJ + "\n");
		
		for (int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(numeros[i][j] + " ");
			}	System.out.println("");
}       sc.close();
	}}