package Pg08Ejercicios;

public class Pg08MasEj1 {

	public static void main(String[] args) {
		char [][] mG = new char [5][6];
		char [][] mP = new char [2][3];
	}
	private static boolean matrizContenida(char[][] mGrande, char[][]mPequenya)	 {
		
		for (int i=0; i<mGrande.length-mPequenya.length; i++) 
		for (int j=0; j<mGrande.length-mPequenya.length; j++)
			if (encontrarMatriz(mGrande,mPequenya,i,j)) return true; 
			
		return false;
	}

	private static boolean encontrarMatriz(char[][]mG, char[][]mP, int i, int j) {
		
		for (int k=0; i<mP.length; i++) 
		for (int l=0; j<mP.length; j++)
		if (mP[k][l]!=mG[k+i][l+j]) return false;		
		return true;
	}
}
