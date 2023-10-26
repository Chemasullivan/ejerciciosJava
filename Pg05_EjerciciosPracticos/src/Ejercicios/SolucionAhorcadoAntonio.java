package Ejercicios;

import java.util.Scanner;

public class SolucionAhorcadoAntonio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	       char [] palabraOriginal = {'A','L','Q','U','E','R','I', 'A','S'};
	       char [] palabraControl  = {'A','L','Q','U','E','R','I', 'A','S'};
	       char [] palabraUser     = {'*','*','*','*','*','*','*', '*','*'};
	       
	       boolean haGanado = false; 
	       boolean haPerdido = false;
	       
	       int posicionesAcertadas = 0;
	       int fallos = 0;
	       
	       do {

	    	   for (int i=0; i<9;i++) System.out.print(palabraUser[i]);
	    	   System.out.println();
	       
	    	   System.out.print("Introduce letra ");
	    	   char letra = sc.next().charAt(0);
	       
	    	   boolean acierto = false;
	    	   for (int i=0; i<9;i++)
	    	   if (palabraControl[i]==letra)
	    	   {
	    		   palabraUser[i] = letra; 
	    		   palabraControl[i] ='*';
	    		   acierto = true;
	    		   posicionesAcertadas++;
	    	   }
	       
	    	   if (acierto) {
	    		   System.out.println("Has acertado");
	    		   if (posicionesAcertadas == palabraOriginal.length) haGanado =true;
	    	   }
	    	   else {
	    		   System.out.println("Has fallado"); 
	    		   fallos++;
	    		   if (fallos ==3) haPerdido =true;
	    	   }
	       } while(!haGanado && !haPerdido);
	      
	       if (haGanado) System.out.println("Has ganado");  
	       else System.out.println("Has perdido");
	 
	       for (int i=0; i<9;i++) System.out.print(palabraOriginal[i]);

	       sc.close();
	    }


	}


