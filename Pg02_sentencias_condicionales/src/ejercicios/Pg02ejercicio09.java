package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un dia");
		int dia = sc.nextInt();
		System.out.println("Introduzca un mes");
		int mes = sc.nextInt();
		System.out.println("Introduzca un año");
		int anyo = sc.nextInt();
		boolean fechaCorrecta = true;
		
		if 		(dia<1 || dia>31) fechaCorrecta = false;
		else if (mes<1 || mes>12) fechaCorrecta = false;
		else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30)) fechaCorrecta = false;
		else if ((mes==2) && (dia<1 || dia>28)) fechaCorrecta = false;
		else if (anyo<1) fechaCorrecta = false;
		
		if (fechaCorrecta) System.out.println(dia + "/" + mes + "/" + anyo);
		else System.out.println("la fecha es incorrecta");
		sc.close();
	}

}
