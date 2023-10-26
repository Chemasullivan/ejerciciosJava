package ejercicios;

import java.util.Scanner;
//Este ejercicio se ha interpretado mal, pedía que la nota mayor y la menor tenian una diferencia de 3 se tenian que eliminar las dos.
public class Pg04ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double [] nota = new double [10];
		for (int i=0; i<10; i++) {
			System.out.println("intruduzca una nota: ");
			nota[i] = sc.nextInt();
			}
		double notaMayor=nota[0], notaMenor=nota[0], suma=0, media=0, suma2Parte;
		for (int i=0; i<10; i++) {
			suma = (suma + nota [i]);
			if (notaMayor<nota[i]) notaMayor=nota[i];
			if (notaMenor>nota[i]) notaMenor=nota[i];
		}
		suma2Parte = suma;
		media = suma/nota.length; System.out.println(suma + " " + media);
		int contador=0;
		if (notaMayor>(media+3)) {suma=suma-notaMayor; System.out.println("se ha quitado la nota mayor :" + notaMayor); contador++;} 
		if (notaMenor<(media-3)) {suma=suma-notaMenor; System.out.println("se ha quitado la nota menor :" + notaMenor); contador++;}
		
		media = suma/(nota.length-contador);
		System.out.println("la media final es: " + media);
		System.out.println(notaMayor);
		System.out.println(notaMenor);
		System.out.println("///////////////////////////////////////////////////////////////////////////////");
		//esto es lo que pide el ejercicio
		System.out.println("suma notas " + suma2Parte);
		if ((notaMayor-notaMenor)>3) media= (suma2Parte-notaMayor-notaMenor)/((nota.length)-2); 
		System.out.println("La nota media es de: " + media);
		sc.close();
	}
}

