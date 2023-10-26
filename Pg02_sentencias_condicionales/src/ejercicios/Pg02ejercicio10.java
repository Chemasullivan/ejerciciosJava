package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un día:");
		int dia = sc.nextInt();
		System.out.println("introduzca un mes:");
		int mes = sc.nextInt();
		System.out.println("introduzca un año:");
		int anyo = sc.nextInt();
		
		int ultimoDia;
		boolean fechaCorrecta = true;
		
		if 		(mes==4 || mes==6 || mes==9 || mes==11) ultimoDia = 30;
		else if (mes ==2 ) ultimoDia = 28;
		else 	 ultimoDia = 31;
		
		if (dia<1 || dia>ultimoDia) fechaCorrecta = false;
		if (mes<1 || mes>12) fechaCorrecta = false;
		if (anyo<1) fechaCorrecta = false;
		
		if (fechaCorrecta) System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + anyo);
		else System.out.println("la fecha es incorrecta");
		
		if (dia != ultimoDia) dia++; 
		else {dia=1; mes++;}
		if (mes==13) {mes = 1; anyo++;}
		
		if (fechaCorrecta) System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + anyo);
		else System.out.println("la fecha es incorrecta");
		System.out.println("");
	}

}
