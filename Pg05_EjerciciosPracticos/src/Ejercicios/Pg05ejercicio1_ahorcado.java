package Ejercicios;

import java.util.Scanner;

public class Pg05ejercicio1_ahorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char [] palabraClave = {'M', 'U', 'R', 'C', 'I', 'A'};
		char [] palabraJugador = new char[palabraClave.length];
		for (int i=0; i<palabraJugador.length; i++) {
			palabraJugador[i] = '_';
			System.out.print(palabraJugador[i] + " ");
		};
		int oportunidades=5;
		boolean encontrada = false;
		
		do {
			boolean acierto = false;
			int comprobar=palabraClave.length;
		System.out.println("\nintroduce una letra: " + "Tienes: " + oportunidades + " oportunidades");
		char letra = Character.toUpperCase(sc.next().charAt(0)); //PARA QUE TODAS LAS LETRAS LAS TOME COMO MAYUSCULAS
		//COMPROBAMOS SI LA LETRA ESTA EN LA PALABRACLAVE
		for (int i=0; i<palabraClave.length; i++) {
			if (letra == palabraClave[i]) {
				palabraJugador[i] = letra; 
				acierto = true; 
					}
						}
			if (!acierto) oportunidades--;
		//COMPROBAMOS QUE LA PALABRA COINCIDE CON LA PALABRACLAVE
		for (int i=0; i<palabraJugador.length; i++) {
			System.out.print(palabraJugador[i] + " ");
			if (palabraClave[i] == palabraJugador[i]) {
				comprobar--;}
			if (comprobar == 0) encontrada = true;
		}
		}
		while (!encontrada && oportunidades>0);
		
		if (encontrada) System.out.println("\nEnhorabuena, has ganado la partida: ");
		else {System.out.println("\nHas perdido la partida"); 
			for (int i=0; i<palabraClave.length; i++) {
				System.out.print(palabraClave[i] + " ");
			}
		
		}
		sc.close();
	}
}


