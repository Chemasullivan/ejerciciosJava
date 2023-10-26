package Ejercicios;

import java.util.Scanner;

public class Pg05ejercicio2_Barcos_v_profesor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int[][] mar = new int[5][6];
		final int AGUA  = 0;
		final int BARCO = 1;

		for (int i=0; i<mar.length;i++)
		for (int j=0; j<mar[0].length;j++) mar[i][j] = AGUA;
		
		mar[2][1]= BARCO; mar[2][2]= BARCO; 
		mar[2][3]= BARCO; mar[2][4]= BARCO;
		
		// .........................
		
		int disparos=0, aciertos=0;
		int fila, col;
		
        do {
 			do {System.out.print("Fila (0-4) ");fila = sc.nextInt();} while (fila<0 || fila>4);
		    do {System.out.print("Col  (0-5) ");col  = sc.nextInt();} while (col<0 || col>5);
		    disparos++;
		    if (mar[fila][col]==BARCO)
		    {	
		    	System.out.println("Tocado");
		    	mar[fila][col]= AGUA; 
		    	aciertos++;
		    }
		    else System.out.println("Agua");
        	
        } while (disparos<8 && aciertos<4);
        
        if (aciertos==4) System.out.println("y Hundido. Enhorabuena");
        else System.out.println("Has perdido");        

        sc.close();

	}

}
