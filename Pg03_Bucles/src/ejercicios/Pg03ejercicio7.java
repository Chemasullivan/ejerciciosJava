package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el nombre del trabajador: ");
		String nombreMayor = sc.nextLine();
		System.out.println("dame el salario del trabajador: ");
		int salarioMayor = sc.nextInt();
		int salarioMenor = salarioMayor; String nombreMenor = nombreMayor;
		
		for(int i=0; i<4; i++) {
		System.out.println("Dame el nombre del trabajador: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		System.out.println("dame el salario del trabajador: ");
		int salario = sc.nextInt();
		
		if (salario > salarioMayor) {salarioMayor=salario; nombreMayor=nombre;}
		if (salario < salarioMenor) {salarioMenor=salario; nombreMenor =nombre;}
		}
		System.out.println(nombreMayor + " " + salarioMayor + "€");
		System.out.println(nombreMenor + " " + salarioMenor + "€");
		
		sc.close();
	}

}
