package ejercicios;

import java.util.Scanner;

public class Pg04ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [][] numeros = {{2,4,6,8,10}, {12,14,16,18,20}, {1,3,5,7,9}, {11,13,15,17,19}};
	
		System.out.println("dame un numero del 1 al 20");
		int numBuscar = sc.nextInt();
		
		boolean encontrado = false;
		int fila=0, columna=0;
		int i=0, j;
		do {
			j=0;
			do {
				if (numBuscar == numeros[i][j]) {encontrado = true; fila = i; columna = j;}
				else j++;}
			while (!encontrado && j<5);
			i++;
		}
		while(!encontrado && i<4);
	if (encontrado) System.out.println("la posicion es: " + fila + " " + columna);
	else System.out.println("No encontrado");
	sc.close();
	
	/**Scanner sc = new Scanner(System.in);
    
    int [][] m = {{7,2,4,6,12},{1,8,3,9,5}, {10,11,14,15,16},{20,18,19,17,13}};
    
    int numero;
    
 	   System.out.print("Introduzca número 1-20 ");
 	   numero = sc.nextInt(); 
    
    
    int fila = -1, columna= -1;
    boolean encontrado = false;
    int i=0;
    while(i<4 && !encontrado) 
    {	   
 	   int j=0;
 	   while(j<5 && !encontrado) 
 	   {
            if (m[i][j]==numero) 
            {
         	   encontrado=true;
         	   fila = i;
         	   columna = j;
            }
 		   j++;
 	   }
 	   i++;
    } 

    if (encontrado) System.out.print("Fila " + fila + ". Columna " + columna); 
    else System.out.print("No encontrado");
    
   sc.close();*/
	
	
	
	}
}
