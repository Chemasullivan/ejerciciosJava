package ejercicios;

import java.util.Random;

public class Pg03ejercicio5 {

	public static void main(String[] args) {
	Random r = new Random();
	
	int contador = 0; int min = 1; int max = 50;
	int primerRango=0; int segundoRango=0; 
	do {
	int numero;
	System.out.println("Introduzca un numero:");
	numero = r.nextInt(max - min  +1) +1;
	System.out.println(numero);
	if (numero>0 && numero<11) primerRango++;
	else segundoRango++;
	contador++;
 	}
	while (contador < 10);
	System.out.println("Hay " + primerRango + " numeros del primer rango " + "\nHay " + segundoRango + " numeros de segundo rango");
} 
}