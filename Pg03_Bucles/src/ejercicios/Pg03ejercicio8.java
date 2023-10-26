package ejercicios;

import java.util.Scanner;

public class Pg03ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salarioMayor, salarioMayor2,salario;
		String nombreMayor, nombreMayor2,nombre;
		System.out.println("dame el nombre del trabajador: ");
		nombreMayor = sc.nextLine();
		System.out.println("dame el salario del trabajaodr: ");
		salarioMayor = sc.nextInt();
		nombreMayor2 = nombreMayor;
		salarioMayor2 = salarioMayor;
		for (int i = 0; i < 4; i++) {
			System.out.println("dame el nombre del trabajador: ");
			sc.nextLine();
			nombre = sc.nextLine();
			System.out.println("dame el salario del trabajador: ");
			salario = sc.nextInt();

			if (salario > salarioMayor) {
				salarioMayor2 = salarioMayor;
				nombreMayor2 = nombreMayor;
				salarioMayor = salario;
				nombreMayor = nombre;
			}
			else if (salario > salarioMayor2) {
				salarioMayor2 = salario;
				nombreMayor2 = nombre;
			}
		}
		System.out.println("el primer trabajador que mas cobra es: " + nombreMayor + " " + salarioMayor + "€"
				+ "\nel segundo trabajador que mas cobra es: " + nombreMayor2 + " " + salarioMayor2 + "€");
		sc.close();
	}

}
