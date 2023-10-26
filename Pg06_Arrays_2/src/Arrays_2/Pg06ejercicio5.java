package Arrays_2;



public class Pg06ejercicio5 {

	public static void main(String[] args) {
		int [] tabla = {9,4,8,10,7,2,1,6,3,5};
		int posMenor=0;
		int aux = tabla[0], i=0, j=0;
		do {
			for (i=j+1; i<tabla.length; i++) { //mete la primera i=1 porque empieza a comprobar desde el segundo puesto.
			if (tabla[i]<tabla[j]) {
				aux = tabla[j]; tabla[j]=tabla[i]; tabla[i]=aux;}
			}j++;
			}
		while(j<9); //se pone 9 porque el ultimo no hace falta hacerlo ya que se quedara al mayor como ultimo.
		
		for(i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		
		}
	}


