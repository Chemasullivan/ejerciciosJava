package ejercicios;
// Realice un programa que lea tres numeros enteros y obtenga el menor
import java.util.Scanner;

public class Pg02ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("dame el primer numero: ");
		int x = sc.nextInt();
		System.out.println("dame el segundo numero: ");
		int y = sc.nextInt();
		System.out.println("dame el segundo numero: ");
		int z = sc.nextInt();
		int menor = x;
		if (y < menor) menor = y;
		if (z < menor) menor = z;
		System.out.println("el numero menor es: " + menor);
		sc.close();

	}

}
