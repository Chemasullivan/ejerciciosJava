package Pg09Ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Pg09ejercicio8 {
	
public static void main(String[] args) {
	Fecha fecha1 = new Fecha();
	Fecha fecha2 = new Fecha(1,1,2024);
	System.out.println(fecha1.diasHastav1(fecha2));
}
public static class Fecha {
		
		private int dia;
		private int mes;
		private int anyo;   
	
		public Fecha() {
			this.dia=1;
			this.mes=1;
			this.anyo=2023;
		}
		
		public Fecha (int dia, int mes, int anyo) {
			this.dia = dia;
			this.mes = mes;
			this.anyo= anyo;
		}
	
	public int diasHastav1(Fecha f ) {
		GregorianCalendar f1 = new GregorianCalendar(this.anyo, this.mes-1, this.dia);
		GregorianCalendar f2 = new GregorianCalendar(f.anyo, f.mes-1, f.dia);
		long segundos = f1.getTimeInMillis() - f2.getTimeInMillis();
		int dias = (int) (segundos/1000/60/60/24);
		return dias;	
	}
	
}
}
