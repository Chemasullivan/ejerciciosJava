package Pg09Ejercicios;

import java.util.GregorianCalendar;

public class Pg09ejercicio5 {

	public static void main(String[] args) {
		
		String diaSemana = diaSemana(2023,9,20);
		System.out.println(diaSemana);
		
	}
	public class Fecha {
		
		private int dia;
		private int mes;
		private int anyo;   
	  }
	
	public static String diaSemana(int anyo, int mes, int dia){
		String [] diasSemana = {"", "DOMINGO", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO"};
		  
	      GregorianCalendar fecha = new GregorianCalendar(anyo, mes-1, dia);
	      return diasSemana[fecha.get(GregorianCalendar.DAY_OF_WEEK)];
	}
}
