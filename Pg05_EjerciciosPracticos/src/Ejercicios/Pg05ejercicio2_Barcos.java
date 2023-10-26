package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Pg05ejercicio2_Barcos {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String [][] tableroRival = new String[5][6];
		for (int i=0; i<tableroRival.length; i++) {
			for (int j=0; j<tableroRival[i].length; j++) {
				tableroRival [i][j] = "*";
			}
		}
		String [][] tableroJugador = new String[5][6];
		for (int i=0; i<tableroJugador.length; i++) {
			for (int j=0; j<tableroJugador[i].length; j++) {
				tableroJugador [i][j] = "*"; 
				}
			}
				for (int i=0; i<tableroJugador.length; i++) {
					for (int j=0; j<tableroJugador[i].length; j++) {	

			System.out.print(tableroJugador[i][j] + " ");	
			}
			System.out.println(" ");
			}
		//tableroRival [1][1] = "b"; tableroRival [2][1] = "b"; tableroRival [3][1] = "b"; tableroRival [4][1] = "b"; //coloca manualmente el barco
		int i, j; 
				int orientacion = r.nextInt(2);	 // aquí se coloca el barco de forma aleatoria.
				if (orientacion==0) {i = r.nextInt(5); 
					j = r.nextInt(2); 
						for(int k=j; k<j+4; k++) {
							tableroRival [i][k] = "b";}
						}
				else { j = r.nextInt(6);
					i = r.nextInt(2);
						for (int k=i; k<i+4; k++) {
							tableroRival [k][j] = "b";}
						}
				
		int fila, columna;
		
		boolean tocadoHundido = false;
		int diana=0, disparos=8;
		do {
			System.out.println("Lanza un disparo:"); 
			do {
				System.out.println("Introduce una fila: (0-4)");
				fila=sc.nextInt();
			}while (fila<0 || fila>4);
			do {
			System.out.println("Introduce una columna: (0-5)");
			columna=sc.nextInt();
			}while (columna<0 || columna>5);
			if (tableroRival[fila][columna] == "b") {tableroJugador[fila][columna]="T"; diana++; System.out.println("TOCADO");}
			else {tableroJugador [fila][columna] = "X"; System.out.println("AGUA");}
			
			disparos--; System.out.println("Te quedan " + disparos + " disparos");
			for(i=0; i<tableroJugador.length; i++) {
				for(j=0;j<tableroJugador[i].length; j++) {
			System.out.print(tableroJugador[i][j] + " ");
				}
			System.out.println(" ");	
			}
			if (diana==4) tocadoHundido = true; 
		}
		while(!tocadoHundido && disparos>0);
			if(tocadoHundido) System.out.println("Enhorabuena, has ganado. Has hundido el barco");
			else System.out.println("Has perdido la partida");
			sc.close();
	}
}
