package Arrays_2;

import java.util.Scanner;

public class Pg06ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numeros = {3,6,8,11,12,17,20,23,25,28};
		System.out.println("introduce un numero 1-30");
		int num=sc.nextInt();
		boolean encontrado = false, fuera=false;
		int i=-1;
		do{
			i++;
			if (num==numeros[i]) encontrado=true;
			if (num<numeros[i]) fuera=true;
		}while(!encontrado && !fuera && num<numeros[i]);
		
		if (encontrado) System.out.println("El numero esta en la poscion " + i);
		else System.out.println("El numero no esta en el array");
		sc.close();
	}

}
