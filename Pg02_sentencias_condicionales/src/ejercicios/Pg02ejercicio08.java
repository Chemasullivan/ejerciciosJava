package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un dia");
		int dia = sc.nextInt();
		System.out.println("Introduzca un mes");
		int mes = sc.nextInt();
		System.out.println("Introduzca un año");
		int anyo = sc.nextInt();
		boolean fecha = true;
		if 		 (dia<1 || dia>30) fecha = false;
		else if  (mes<1 || mes>12) fecha = false;
		else if	 (anyo<1) 		   fecha = false;
		
		if (fecha) System.out.println(dia + "/" + mes + "/" + anyo + " corecto");
		else 	   System.out.println("La fecha es incorrecta");
		sc.close();
	}

}