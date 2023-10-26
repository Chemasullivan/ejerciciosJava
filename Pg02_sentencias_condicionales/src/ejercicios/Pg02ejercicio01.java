package ejercicios;

import java.util.Scanner;

public class Pg02ejercicio01 {
	//Ejercicio 1 y 2 Realice un programa que lea dos numeros enteros y muestre su producto si este es mayor que 10, en caso 
	//contrario indicará al usuario que el producto no es mayor que 10.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un numero");
		int numero1 = sc.nextInt();
		System.out.println("dame otro numero");
		int numero2 =sc.nextInt();
		int producto = numero1 * numero2;
		if (producto>10) {
			System.out.println("El resultado del producto es: " + producto);
		}
		else System.out.println("El producto no es mayor que 10");
        sc.close();

	}

}
