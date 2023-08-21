package ejercicios;
//desarrolle una versión mejorada del ejercicio anterior, con mensajes al usuario
import java.util.Scanner;

public class Pg01ejercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un numero entero: ");
		int numero1 = sc.nextInt();
		System.out.println("dame otro numero entero: ");
		int numero2 =sc.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("el resultado de la suma de los dos nuemros es: " + resultado);
}
}
