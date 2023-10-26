package Arrays_2;

import java.util.Random;
import java.util.Scanner;

public class Pg06ejercicio1 {
	//aquí una forma para pedir numeros aleatorios que no se repitan
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random ();
		int [] numeros = new int[20];
		int numeroAleatorio; 
		boolean[] usado = new boolean[41];
		for(int i=0; i<numeros.length; i++) {
			do{
				numeroAleatorio = r.nextInt(40)+1;
			}while(usado[numeroAleatorio]);
			numeros[i]=numeroAleatorio;
			usado[numeroAleatorio]=true;
		}
		System.out.println("introcuce un numero:");
		int numBuscar = sc.nextInt();
		
		boolean encontrado = false;
		int i=0;
		do {
			if (numBuscar == numeros[i]) encontrado = true;
			i++;
		}
		while(!encontrado && i<20);
		if (encontrado) System.out.println("El numero " + numBuscar + " esta en la posición " + i + " del vector");
		else System.out.println("El numero " + numBuscar + " no está en el vector");
		for (i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
			sc.close();
		}
	}

}
