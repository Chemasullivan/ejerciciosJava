package Pg08Ejercicios;

import java.util.Scanner;

public class Pg08ejercicio1_Ahorcado_metodos {

	public static void main(String[] args) {
		
		char [] palabraClave = {'C', 'A', 'M', 'I', 'O', 'N'};
		char [] palabraJugador = new char[palabraClave.length];
		int oportunidades=5; 
		imprimeComienzo(palabraJugador);
		boolean encontrada = false;
		do {	
			int comprobar=palabraClave.length;
			char letraIngresada = pedirLetra(oportunidades);
			if (comprobarLetra(palabraClave, letraIngresada, palabraJugador)); 
			else oportunidades--;
			if (comprobarPalabra(palabraJugador, palabraClave, comprobar)) encontrada=true;
			
		}while (!encontrada && oportunidades>0);
		
		if (encontrada) System.out.println("\nEnhorabuena, has ganado la partida: ");
		else {System.out.println("\nHas perdido la partida"); 
			for (int i=0; i<palabraClave.length; i++) {
				System.out.print(palabraClave[i] + " ");}
			}
		/**char [] palabraJugador = new char[palabraClave.length];
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
}*/
		
}
	
	private static char[] imprimeComienzo (char[]palabra) {
		
		for (int i=0; i<palabra.length; i++) {
			palabra[i] = '_';
			System.out.print(palabra[i] + " ");
		};
		
		return palabra;
	}
	
	private static char pedirLetra(int oportunidades) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce una letra: " + "Tienes: " + oportunidades + " oportunidades");
		char letra = Character.toUpperCase(sc.next().charAt(0));
		sc.close();
		return letra;
		
	}
	
	private static boolean comprobarLetra(char[]palabraClave, char letra, char [] palabraJugador) {
		boolean acierto = false;
		for (int i=0; i<palabraClave.length; i++) {
			if (letra == palabraClave[i]) {
				palabraJugador[i] = letra; 
				acierto = true; 
					}
		}
		return acierto;
	}
	
	private static boolean comprobarPalabra(char[]palabraJugador, char[]palabraClave, int comprobar) {
	boolean encontrada=false; comprobar=palabraClave.length;
	for (int i=0; i<palabraJugador.length; i++) {
		System.out.print(palabraJugador[i] + " ");
		if (palabraClave[i] == palabraJugador[i]) {
			comprobar--;}
		if (comprobar == 0) encontrada = true;
	}
	 return encontrada;	 
}	 
}