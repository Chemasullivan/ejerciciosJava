package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class flotaLetras {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String [][] tableroRival = new String[10][10];
		String [][] tableroJugador = new String[10][10];
		int colocado;
		int [] tableroCoordenadas = new int[11]; int numero=0;
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
						tableroRival [i][k] = "\u001B[94mP\u001B[0m";}
			}
			else { j = r.nextInt(10);
				i = r.nextInt(6);
					for (int k=i; k<i+5; k++) {
						tableroRival [k][j] = "\u001B[94mP\u001B[0m";}
					}
			//ACORAZADO 4
				orientacion = r.nextInt(2);	 
			
			if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(7);  
					for(int k=j; k<j+4; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "\u001B[94mA\u001B[0m";}
				}
			else { j = r.nextInt(10);
				i = r.nextInt(7);
					for (int k=i; k<i+4; k++) { if (tableroRival [k][j] !="*") {colocado++;}
						tableroRival [k][j] = "\u001B[94mA\u001B[0m";}
				}
			//SUBMARINO 3
				orientacion = r.nextInt(2);	 
				if (orientacion==0) {i = r.nextInt(10); 
					j = r.nextInt(8);  
					for(int k=j; k<j+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "\u001B[94mS\u001B[0m";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(8);
					for (int k=i; k<i+3; k++) { if (tableroRival [k][j] !="*") {colocado++;}
						tableroRival [k][j] = "\u001B[94mS\u001B[0m";}
					}
			//FRAGATA 3
			orientacion = r.nextInt(2);	
				if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(8); 
					for(int k=j; k<j+3; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "\u001B[94mF\u001B[0m";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(8);
					for (int k=i; k<i+3; k++) { if (tableroRival [k][j] !="*") {colocado++;}
						tableroRival [k][j] = "\u001B[94mF\u001B[0m";}	
				}
			//LANCHA 2	
			orientacion = r.nextInt(2);	 
				if (orientacion==0) {i = r.nextInt(10); 
				j = r.nextInt(9);  
					for(int k=j; k<j+2; k++) { if (tableroRival [i][k] !="*") {colocado++;}
						tableroRival [i][k] = "\u001B[94mL\u001B[0m";}
					}
				else { j = r.nextInt(10);
					i = r.nextInt(9);
					for (int k=i; k<i+2; k++) { if (tableroRival [k][j] !="*") {colocado++;}
						tableroRival [k][j] = "\u001B[94mL\u001B[0m";}	
				}
		}			
		while(colocado>0);
		//tableroRival si descomentas el siguiente bloque saldría al inicio del programa las posiciones de los barcos que ha colocado la máquina.(borrar 'char' abajo donde señala el aviso)
		/*System.out.println(" "); char letra = 'A'; numero=0;
		for (int j=1; j<11; j++) {tableroCoordenadas [j] = numero++; System.out.print("\u001B[33m" + tableroCoordenadas[j] + "\u001B[0m" + " ");} System.out.print("\n"); System.out.print("");
		for (int i=0; i<tableroRival.length; i++) {
			for (int j=0; j<tableroRival[i].length; j++) {	
				System.out.print(tableroRival[i][j] + " ");	
			}
			System.out.println("\u001B[33m" + letra + "\u001B[0m"); letra = (char) (letra + 1) ;
		}*/
		
			System.out.println(" "); char letra = 'A'; numero=0;
			for (int j=1; j<11; j++) {tableroCoordenadas [j] = numero++; System.out.print("\u001B[33m" + tableroCoordenadas[j] + "\u001B[0m" + " ");} System.out.print("\n"); System.out.print("");
			for (int i=0; i<tableroJugador.length; i++) {
				for (int j=0; j<tableroJugador[i].length; j++) {	
					System.out.print(tableroJugador[i][j] + " ");	
				}
				System.out.println("\u001B[33m" + letra + "\u001B[0m"); letra = (char) (letra + 1) ;
			}
		String letraPedida; int columna =-1, fila=-1;
		
		boolean hundidaFlota = false;
		int diana=0, dianaP=0, dianaA=0, dianaS=0, dianaF=0, dianaL=0, disparos=40;
		do {
			System.out.println("Lanza un disparo:"); 
			do {
				System.out.println("Introduce una letra: (A-J)"); ;
				letraPedida=sc.next().toUpperCase(); 
					if (letraPedida.length() == 1 && letraPedida.charAt(0) >= 'A' && letraPedida.charAt(0) <= 'J') {
		            char letraFila = letraPedida.charAt(0); 
		            int valorNumerico = letraFila - 'A'; fila = valorNumerico;
					}
					else fila = -1;
			}while (fila<0 || fila>10);
			boolean valida = false;
			do {
			System.out.println("Introduce una columna: (0-9)");
			if (sc.hasNextInt()) {
				columna = sc.nextInt();
			  if (columna >=0 && columna <=9) {valida = true;}
			}
			else sc.next();
			}while (!valida);
			if      (tableroRival[fila][columna]=="\u001B[94mP\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; diana++; dianaP++; System.out.println("\u001B[31mTOCADO\u001B[0m");} 
			else if (tableroRival[fila][columna]=="\u001B[94mA\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; diana++; dianaA++; System.out.println("\u001B[31mTOCADO\u001B[0m");}
			else if (tableroRival[fila][columna]=="\u001B[94mS\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; diana++; dianaS++; System.out.println("\u001B[31mTOCADO\u001B[0m");}
			else if (tableroRival[fila][columna]=="\u001B[94mF\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; diana++; dianaF++; System.out.println("\u001B[31mTOCADO\u001B[0m");}
			else if (tableroRival[fila][columna]=="\u001B[94mL\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; diana++; dianaL++; System.out.println("\u001B[31mTOCADO\u001B[0m");}
			else if (tableroRival[fila][columna]=="\u001B[31m#\u001B[0m") {tableroJugador[fila][columna]="\u001B[31mT\u001B[0m"; tableroRival[fila][columna]="\u001B[31m#\u001B[0m"; System.out.println("AGUA-REPETIDO");}
			else {tableroJugador [fila][columna]= "\u001B[30mX\u001B[0m"; tableroRival[fila][columna]=   "\u001B[30mX\u001B[0m"; System.out.println("AGUA");}
			
			disparos--; System.out.println("Te quedan " + disparos + " disparos.   Llevas " + diana + " \u001B[32mACIERTOS\u001B[0m") ;
			
			if (dianaP==5) System.out.println("\u001B[94mHundido PORTAVIONES\u001B[0m");
			if (dianaA==4) System.out.println("\u001B[94mHundido ACORAZADO\u001B[0m");
			if (dianaS==3) System.out.println("\u001B[94mHundido SUBMARINO\u001B[0m");
			if (dianaF==3) System.out.println("\u001B[94mHundido FRAGATA\u001B[0m");
			if (dianaL==2) System.out.println("\u001B[94mHundido LANCHA\u001B[0m");
			if (diana==17) hundidaFlota = true;
			
			System.out.println(" "); letra = 'A'; numero=0;
			for (int j=1; j<11; j++) {tableroCoordenadas [j] = numero++; System.out.print("\u001B[33m" + tableroCoordenadas[j] + "\u001B[0m" + " ");} System.out.print("\n"); System.out.print("");
			for (int i=0; i<tableroJugador.length; i++) {
				for (int j=0; j<tableroJugador[i].length; j++) {	
					System.out.print(tableroJugador[i][j] + " ");	
				}
				System.out.println("\u001B[33m" + letra + "\u001B[0m"); letra = (char) (letra + 1) ;
			}
		}
		while(!hundidaFlota && disparos>0);
			if(hundidaFlota) {System.out.println("Enhorabuena, HAS GANADO!! Has hundido toda la flota");
			for (int i=0; i<tableroJugador.length; i++) {
				for(int j=0; j<tableroJugador[i].length; j++) {
					if (tableroRival [i][j] == "\u001B[94mP\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
					if (tableroRival [i][j] == "\u001B[94mA\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
					if (tableroRival [i][j] == "\u001B[94mS\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
					if (tableroRival [i][j] == "\u001B[94mF\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
					if (tableroRival [i][j] == "\u001B[94mL\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
					if (tableroRival [i][j] == "*" && tableroJugador [i][j] == "X" ) tableroRival [i][j] = "X";						
					System.out.print(tableroRival[i][j] + " ");
				}System.out.println(" ");
			}
		}
			else {System.out.println("Lo siento. HAS PERDIDO!!"); 
				for (int i=0; i<tableroJugador.length; i++) {
					for(int j=0; j<tableroJugador[i].length; j++) {
						if (tableroRival [i][j] == "\u001B[94mP\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
						if (tableroRival [i][j] == "\u001B[94mA\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
						if (tableroRival [i][j] == "\u001B[94mS\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
						if (tableroRival [i][j] == "\u001B[94mF\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
						if (tableroRival [i][j] == "\u001B[94mL\u001B[0m" && tableroJugador [i][j] == "T" ) tableroRival [i][j] = "#";
						if (tableroRival [i][j] == "*" && tableroJugador [i][j] == "X" ) tableroRival [i][j] = "X";						
						System.out.print(tableroRival[i][j] + " ");
					}System.out.println(" ");
				}
			}
			sc.close();
	}
}

