package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio03 {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("dame un numero:");
	int numero = sc.nextInt();
	/**if (numero < 0) {
		System.out.println("El numero es negativo.");}
	if (numero == 0) {
		System.out.println("El numero es nulo.");}
	if (numero > 0) {
		System.out.println("El numero es positivo");}
	*/
	if 		(numero > 0) System.out.println("El numero es positivo.");
	else if (numero < 0) System.out.println("el numero es negativo.");
	else 				 System.out.println("El numero es nulo.");
	sc.close();
		}
	}
		


	


