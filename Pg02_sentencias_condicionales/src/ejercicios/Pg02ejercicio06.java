package ejercicios;

import java.util.Scanner;
//ejercicio 6 y 7 desarrollo de nuevo el ejercicio anterior, utilizanod ahora como recurso el intercmbio de valores entre dos variable x e y. 
public class Pg02ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("dame el primer numero: ");
		int x = sc.nextInt();
		System.out.println("dame el segundo numero: ");
		int y = sc.nextInt();
		System.out.println("dame el tercero numero: ");
		int z = sc.nextInt();
		int aux = x;
		
		if (y>x)  {aux=x; x=y; y=aux;}
		if (z>x)  {aux=x; x=z; z=aux;}
		if (z>y)  {aux=y; y=z; z=aux;}
		System.out.println("mayor a menor:" + x + " " + y + " " + z);
		sc.close();
	}

}
