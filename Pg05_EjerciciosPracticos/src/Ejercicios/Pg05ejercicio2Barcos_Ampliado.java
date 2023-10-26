package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Pg05ejercicio2Barcos_Ampliado {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String [][] tableroRival = new String[10][10];
		String [][] tableroJugador = new String[10][10];
		int colocado;
		
		do{
			colocado=0;
			for (int i=0; i<tableroRival.length; i++) {
			for (int j=0; j<tableroRival[i].length; j++) {
				tableroRival [i][j] = "*"; tableroJugador [i][j] = tableroRival [i][j];
			}
		}
		int i, j; 
			//PORTAVIONES 5
			int orientacion = r.nextInt(2);	 
			if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(6); 
					for(int k=j; k<j+5; k++) {
						tableroRival [i][k] = "P";}
			}
			else { j = r.nextInt(10);
				i = r.nextInt(6);
					for (int k=i; k<i+5; k++) {
						tableroRival [k][j] = "P";}
					}
			//ACORAZADO 4
				orientacion = r.nextInt(2);	 
			
			if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(6);  
					for(int k=j; k<j+4; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "A";}
				}
			else { j = r.nextInt(10);
				i = r.nextInt(6);
					for (int k=i; k<i+4; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "A";}
				}
			//SUBMARINO 3
				orientacion = r.nextInt(2);	 
				if (orientacion==0) {i = r.nextInt(10); 
					j = r.nextInt(6);  
					for(int k=j; k<j+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "S";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(6);
					for (int k=i; k<i+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "S";}
					}
			//FRAGATA 3
			orientacion = r.nextInt(2);	
				if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(6); 
					for(int k=j; k<j+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "F";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(6);
					for (int k=i; k<i+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "F";}	
				}
			//LANCHA 2	
			orientacion = r.nextInt(2);	 
				if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(6);  
					for(int k=j; k<j+2; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "L";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(6);
					for (int k=i; k<i+2; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "L";}	
				}
		}			
		while(colocado>1);
			for (int i=0; i<tableroJugador.length; i++) {
				for (int j=0; j<tableroJugador[i].length; j++) {	
					System.out.print(tableroJugador[i][j] + " ");	
				}
				System.out.println(" ");
			}
		int fila, columna;
		
		boolean hundidaFlota = false;
		int diana=0, dianaP=0, dianaA=0, dianaS=0, dianaF=0, dianaL=0, disparos=50;
		do {
			System.out.println("Lanza un disparo:"); 
			do {
				System.out.println("Introduce una fila: (0-9)");
				fila=sc.nextInt();
			}while (fila<0 || fila>10);
			do {
			System.out.println("Introduce una columna: (0-9)");
			columna=sc.nextInt();
			}while (columna<0 || columna>10);
			if      (tableroRival[fila][columna]=="P") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; diana++; dianaP++; System.out.println("TOCADO");} 
			else if (tableroRival[fila][columna]=="A") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; diana++; dianaA++; System.out.println("TOCADO");}
			else if (tableroRival[fila][columna]=="S") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; diana++; dianaS++; System.out.println("TOCADO");}
			else if (tableroRival[fila][columna]=="F") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; diana++; dianaF++; System.out.println("TOCADO");}
			else if (tableroRival[fila][columna]=="L") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; diana++; dianaL++; System.out.println("TOCADO");}
			else {tableroJugador [fila][columna] = "X"; System.out.println("AGUA");}
			
			disparos--; System.out.println("Te quedan " + disparos + " disparos.   Llevas " + diana + " ACIERTOS") ;
			for(int i=0; i<tableroJugador.length; i++) {
				for(int j=0;j<tableroJugador[i].length; j++) {
			System.out.print(tableroJugador[i][j] + " ");
				}
			System.out.println(" ");	
			}
			if (dianaP==5) System.out.println("Hundido PORTAVIONES");
			if (dianaA==4) System.out.println("Hundido ACORAZADO");
			if (dianaS==3) System.out.println("Hundido SUBMARINO");
			if (dianaF==3) System.out.println("Hundido FRAGATA");
			if (dianaL==2) System.out.println("Hundido LANCHA");
			if (diana==17) hundidaFlota = true; 
		}
		while(!hundidaFlota && disparos>0);
			if(hundidaFlota) {System.out.println("Enhorabuena, HAS GANADO!! Has hundido toda la flota");
			for (int i=0; i<tableroJugador.length; i++) {
				for(int j=0; j<tableroJugador[i].length; j++) {
					if (tableroRival [i][j] == "B" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "T";
					if (tableroRival [i][j] == "*" && tableroJugador [i][j] == "X" ) tableroRival [i][j] = "X";						
					System.out.print(tableroRival[i][j] + " ");
				}System.out.println(" ");
			}
		}
			else {System.out.println("Lo siento. HAS PERDIDO!!"); 
				for (int i=0; i<tableroJugador.length; i++) {
					for(int j=0; j<tableroJugador[i].length; j++) {
						if (tableroRival [i][j] == "B" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "T";
						if (tableroRival [i][j] == "*" && tableroJugador [i][j] == "X" ) tableroRival [i][j] = "X";						
						System.out.print(tableroRival[i][j] + " ");
					}System.out.println(" ");
				}
			}
			sc.close();
	}
}

