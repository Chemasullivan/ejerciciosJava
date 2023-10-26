package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio09v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un dia");
		int dia = sc.nextInt();
		System.out.println("Introduzca un mes");
		int mes = sc.nextInt();
		System.out.println("Introduzca un año");
		int anyo = sc.nextInt();
		boolean fechaCorrecta = true;
		int ultimoDia;
		
		if 		(mes==4 || mes==6 || mes==9 || mes==11) ultimoDia = 30;
		else if (mes ==2 ) ultimoDia = 28;
		else 	 ultimoDia = 31;
		
		if (dia<1 || dia>ultimoDia) fechaCorrecta = false;
		if (mes<1 || mes>12) fechaCorrecta = false;
		if (anyo<1) fechaCorrecta = false;
		
		if (fechaCorrecta) System.out.println(dia + "/" + mes + "/" + anyo);
		else System.out.println("la fecha es incorrecta");
		sc.close();
		
	}

}
