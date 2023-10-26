package Arrays_2;



public class Pg06ejercicio3 {

	public static void main(String[] args) {

		int [] numeros = {6,5,9,0,4,8,1,3,2,7};
		int aux;
		int i=0;
		int numeroMenor = numeros[i];
		
		for(i=0; i<numeros.length; i++) {
		if (numeros[i]<numeroMenor) {numeroMenor = numeros[i]; 
		aux=numeros[0]; numeros[0]=numeroMenor; numeros[i]=aux;} 
		}
		
		for(i=0; i<numeros.length; i++)
		System.out.print(numeros[i] + " ");
	}
}
