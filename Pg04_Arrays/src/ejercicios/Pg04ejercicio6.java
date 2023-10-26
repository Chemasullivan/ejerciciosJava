package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int[10];
		int i=0;
		do {
			do{
			System.out.println("introduce un numero del 1 al 20");
			numeros [i] = sc.nextInt();}
			while (numeros[i]<0 || numeros[i]>20);
			i++;
		}
		while (i<10);
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \nEscribe el numero a buscar:");
		int numBuscar = sc.nextInt();
		boolean encontrado = false; 
		i=0;
		do {
			if (numBuscar == numeros[i]) encontrado = true;
			else i++;
		}
		while (!encontrado && i<9);
		
		if (encontrado) System.out.println("La posición del numero " + numBuscar + " es: " + i);
		else System.out.println("El numero " + numBuscar + " no esta en el vector");
		sc.close();
	}

}
