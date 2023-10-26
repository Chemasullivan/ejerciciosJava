package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("dame una calificacion del 1 al 10");
		int calificacion = sc.nextInt();
			String resultado;
			switch (calificacion) {
			case 0:
				resultado = "muy deficiente";
				break;
			case 1,2,3,4:
				resultado = "insuficiente";
				break;
			case 5:
				resultado = "suficiente";
				break;
			case 6:
				resultado = "bien";
				break;
			case 7,8:
				resultado = "notable";
				break;
			case 9,10:
				resultado = "sobresaliente";
				break;
			default:
				resultado = "esta nota no es valida";
							
			}
			System.out.println("la nota es de: " + resultado);
		}
		
	}


