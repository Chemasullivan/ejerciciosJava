package Pg09Ejercicios;

import java.util.GregorianCalendar;

public class Pg09ejercicio4 {

	public static void main(String[] args) {
		
	GregorianCalendar gc = new GregorianCalendar();	
	
	int anyo = gc.get(GregorianCalendar.YEAR);
	int mes = gc.get(GregorianCalendar.MONTH)+1;
	int dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
	
	System.out.println(anyo + "/" + mes + "/" + dia);
	
	}	 
 }


