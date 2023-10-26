package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio5v2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero; int primerRango=0; int segundoRango=0;
	for(int i=0; i<10; i++) {
		do {
			System.out.println("introduce un numero:");
			numero = sc.nextInt();	
		}
		while (numero < 0);
	if (numero>0 && numero < 10) primerRango++;
	else segundoRango++;
	}
	System.out.println("Hay " + primerRango + " numeros de 1-10" + "\nHay " + segundoRango + " numeros de mas de 10");	
	sc.close();
	}
}
