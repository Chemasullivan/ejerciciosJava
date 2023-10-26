package ejercicios;

import java.util.Scanner;
//Realice un programa que lea tres numeros enteros y obtenga el mayor.
public class Pg02ejercicio04 {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("dame el primer numero:");
	int num1 = sc.nextInt();
	System.out.println("Dame el segundo numero:");
	int num2 = sc.nextInt();
	System.out.println("Dame el tercer numero");
	int num3 = sc.nextInt();
	int numeroMayor = num1;
	/**if ((num1 > num2) && (num1 > num3)) { 
	System.out.println("El numero mayor es: " + num1);}
	if (num2 > num3 && num2 > num1) {
		System.out.println("El numero mayor es : " + num2);}
	if (num3 > num2 && num3 > num1) {
		System.out.println("El numero mayor es " + num3);
	} */
	if (num2 > numeroMayor) numeroMayor=num2;
	if (num3 > numeroMayor) numeroMayor=num3;	
	System.out.println("el numero mayor es: " + numeroMayor);
	sc.close();
	}

}

