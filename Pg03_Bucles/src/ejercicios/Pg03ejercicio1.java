package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("dame un numero del 1 al 10");
	int numero =sc.nextInt();
	while (numero<1 || numero>10) {
	System.out.println("vuelve a introducir un numero del 1 al 10");
	numero =sc.nextInt();
	}
	System.out.println("Ha finalizado el programa");
	sc.close();
	}

}
