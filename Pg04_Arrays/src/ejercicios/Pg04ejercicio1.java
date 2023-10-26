package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio1 {

	public static void main(String[] args) {
/**		int [] numeros = {1,2,3,4,5}; //inicializar conociendo los numeros
		int [] numeros2 = new int[5]; //inicializar un array de enteros de tamaño 5
		for(int i=0; i<numeros.length; i++) {
		System.out.println(numeros[i] + " ");
		}
		for (int numero : numeros2) {
			System.out.println(numero + " ");
			*/
/**		int [] numeros = {2, 6, 7, 3, 9}; //interpretacion mal del ejercicio aqui señala cuales son, en el ejercicio pide cuantos son.
		float media = 0, suma =0; 
		for (int i=0; i<numeros.length; i++) {
			suma=suma + numeros[i];
		}
		media = suma / numeros.length;
		System.out.println("La media es: " + media);
		for (int i=0; i<numeros.length; i++) {
		if (numeros[i] > media) 
			System.out.println(numeros[i] + " Es mayor a la media");
	}
*/
		Scanner sc = new Scanner (System.in);
		double [] numeros = new double[5];
		for (int i=0; i<5; i++) {
		System.out.println("Introduce los numeros del array:");
		numeros [i] = sc.nextInt();}
		
		double media = 0, suma =0; int contador=0; 
		for (int i=0; i<numeros.length; i++) {
			suma=suma + numeros[i];
		}
		media = suma / numeros.length;
		System.out.println("La media es: " + media);
		for (int i=0; i<numeros.length; i++) {
		if (numeros[i] > media) 
			contador++;
		}
		System.out.println("Hay " + contador + " superiores a la media");
		sc.close();
}
}