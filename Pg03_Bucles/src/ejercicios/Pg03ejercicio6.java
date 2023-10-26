package ejercicios;

import java.util.Random;

public class Pg03ejercicio6 {

	public static void main(String[] args) {
		Random r = new Random();
		int max = 20; int min = -20;
		System.out.println("introduce un numero entero:");
		int numeroMayor = r.nextInt(max - min +1) +1 ;
		System.out.println(numeroMayor);
		for (int i=0; i<4; i++) {
				System.out.println("Introduce un numero entero:");
				int numero = r.nextInt(max - min +1) +1 ;
				System.out.println(numero);
				if (numero>numeroMayor) numeroMayor=numero;
		}
		System.out.println("El numero mayor es: " + numeroMayor);
	}

}
