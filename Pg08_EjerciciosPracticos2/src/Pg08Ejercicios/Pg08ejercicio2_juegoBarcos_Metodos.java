package Pg08Ejercicios;

import java.util.Scanner;

public class Pg08ejercicio2_juegoBarcos_Metodos {

	public static void main(String[] args) {
		int partidas=0, victorias=0;
		do {
			partidas++;
			if (jugar()) victorias++;	
		}while(seguir());
		System.out.println("llevas " + victorias + " Victoria de " + partidas + " partidas");
	}
	private static boolean seguir() {
		Scanner sc = new Scanner(System.in);
		char juega; boolean sigue;
		do{
			System.out.println("quieres volver a jugar al juego de los barcos? s/n");
			juega = sc.next().charAt(0);
		}while(juega!='s' && juega!='n');
		if (juega=='s') sigue = true;
		else sigue = false;
		return sigue;
	}
	
	private static boolean jugar() {
		String [][] tableroMaquina = new String [6][6];
		for(int i=0; i<tableroMaquina.length; i++) {
			for(int j=0; j<tableroMaquina.length; j++) {
				tableroMaquina [i][j]="*";
			}
		}
		tableroMaquina [1][1]="B";tableroMaquina [1][2]="B";tableroMaquina [1][3]="B";tableroMaquina [1][4]="B";

		String [][] tableroJugador = new String [6][6];
		for(int i=0; i<tableroJugador.length; i++) {
			for(int j=0; j<tableroJugador.length; j++) {
				tableroJugador [i][j]="*";
			}
		}
		int tocado=0, oportunidades=6; boolean saleJuego;
		do{
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un disparo");
		int posI = sc.nextInt();
		int posJ = sc.nextInt();
		
		if (tableroMaquina[posI][posJ]=="B") {tableroJugador[posI][posJ]="T"; tocado++; System.out.println("TOCADO");}
		else {tableroJugador[posI][posJ]="A"; oportunidades--; System.out.println("AGUA");}
		for(int i=0; i<tableroJugador.length;i++) {
			for(int j=0;j<tableroJugador.length;j++) {
				System.out.print(tableroJugador[i][j] + " ");
			}System.out.println(" ");
		}
		}while(tocado<4 && oportunidades>0);
		if (tocado==4) {saleJuego=true; System.out.println("Has ganado");}
		else {saleJuego=false; System.out.println("Has perido");}
		return saleJuego;
	}

}	
