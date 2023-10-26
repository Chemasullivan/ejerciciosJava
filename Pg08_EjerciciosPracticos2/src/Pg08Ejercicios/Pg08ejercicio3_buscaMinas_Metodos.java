package Pg08Ejercicios;

import java.util.Scanner;

public class Pg08ejercicio3_buscaMinas_Metodos {

	public static void main(String[] args) {
		//Maquina
		String [][] campo = new String[8][8];
		comienzoCampo(campo);
		minasMaquina(campo);
		//imprime(campo); imprime las minas al comienzo de la partida
		//Jugador
		String [][] campoJugador = new String[8][8];
		comienzoCampo(campoJugador);
		int oportunidades=3, casillaLibre=0;
		do{
			int cuentaMina=0; 
			if (hayMina(coordenadaI(),coordenadaJ(),campo,campoJugador, oportunidades, cuentaMina)) {oportunidades--;}
			imprime(campoJugador);
		
		}while(oportunidades>0 && casillasLibre(casillaLibre, campoJugador)<58);
		if (oportunidades==0) System.out.println("Has perdido");
			else System.out.println("HAs GANADO LA PARTIDA");
	 
	}
	
	private static void imprime(String campoJugador [][]) {
		for(int i=0; i<campoJugador.length; i++) {
			for(int j=0; j<campoJugador.length; j++) {
				System.out.print(campoJugador[i][j] + " ");
			}System.out.println(" ");
		}
	}
	private static int casillasLibre(int casillaLibre, String campoJugador [][]) {
		casillaLibre=0;
		for(int i=0; i<campoJugador.length; i++) {
			for(int j=0; j<campoJugador.length; j++) {
				if (campoJugador[i][j]=="O") casillaLibre++;
			}}
		return casillaLibre;
	}
	private static boolean hayMina(int i, int j, String[][] campo, String [][]campoJugador, int oportunidades, int cuentaMina) { 
		boolean mina = false;
	if (campo[i][j]=="*") {oportunidades--;System.out.println("MINA EXPLOTADA: te quedán " + oportunidades + " oportunidades");
		comienzoCampo(campoJugador); mina = true;}
		else { 		 campoJugador[i][j] = "O"; 
			try {if (campo[i-1][j-1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i-1][j]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i-1][j+1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i][j-1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i][j+1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i+1][j-1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i+1][j]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			try {if (campo[i+1][j+1]=="*") cuentaMina++; }catch (ArrayIndexOutOfBoundsException e) {};
			System.out.println("Hay " + cuentaMina + " minas alrededor");
			mina = false;
	}
	return mina;
}	
	
	private static void comienzoCampo(String campoJugador[][]) {
		for(int i=0; i<campoJugador.length; i++) {
			for(int j=0; j<campoJugador.length; j++) {
				campoJugador[i][j]="-";}
			}
	}
	private static int coordenadaI() {
		Scanner sc = new Scanner(System.in);
		int celdaI;
		do{
			System.out.println("introduce una coordenada: i");
			celdaI = sc.nextInt();
		}while(celdaI<0 || celdaI>7); sc.close();
		return celdaI;
	}
	private static int coordenadaJ() {
		Scanner sc = new Scanner(System.in);
		int celdaJ;
		do{
			System.out.println("introduce una coordenada: j");
			celdaJ = sc.nextInt();
		}while(celdaJ<0 || celdaJ>7); sc.close();
		return celdaJ;
	}
	private static void minasMaquina(String campo[][]) {
		campo[0][0]="*";campo[0][1]="*";campo[0][2]="*";campo[0][3]="*";campo[0][3]="*";campo[0][4]="*";campo[0][5]="*";
	}
	
	
}