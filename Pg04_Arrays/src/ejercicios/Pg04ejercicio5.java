package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		int [] numeros = new int [10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce numeros del 1 al 10: ");
			numeros [i] = sc.nextInt();			
		}
		System.out.println("Introduce un valor del 1 al 10:");
		int numBuscar = sc.nextInt();
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<10) {
		if (numeros[i] == numBuscar) encontrado = true;
		else i++;
		}
		if (encontrado) System.out.println("la posicion del numero " + numBuscar + " es: " + i);
		else System.out.println("Ha habido un error al meter los datos");
	    sc.close();
	}
}
