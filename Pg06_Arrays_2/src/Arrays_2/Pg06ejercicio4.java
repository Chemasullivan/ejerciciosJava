package Arrays_2;

public class Pg06ejercicio4 {

	public static void main(String[] args) {
		int [] tabla ={6,8,4,5,9,10,3,1,2,7};
		int posMenor = 0;
		int posMenor2 = 1;
		int posMenor3 = 2;
		int aux;
		int i=0;
		for(i=0; i<tabla.length; i++) {
			if (tabla[i]<tabla[posMenor]) {
				aux = tabla[0]; tabla[0]=tabla[i]; tabla[i]=aux;}}
		for(i=1; i<tabla.length; i++) {
			if (tabla[i]<tabla[posMenor2]) { 
				aux = tabla[1]; tabla[1]=tabla[i]; tabla[i]=aux;}}	
		for(i=2; i<tabla.length; i++) {
			if (tabla[i]<tabla[posMenor3]) { 
				aux = tabla[2]; tabla[2]=tabla[i]; tabla[i]=aux;}}
		
		for(i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
	}

}
