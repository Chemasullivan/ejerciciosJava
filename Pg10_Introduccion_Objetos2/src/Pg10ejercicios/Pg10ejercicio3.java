package Pg10ejercicios;

import java.util.GregorianCalendar;

public class Pg10ejercicio3 {

	public static void main(String[] args) {
	char caracter='0'; int numero=caracter-'0';
	System.out.println(numero);
	Fecha f = new Fecha("3/05/1981");
	System.out.println(f);
	}

	public static class Fecha {
		private int dia;
		private int mes;
		private int anyo;
	
	public Fecha () {
		this.dia=1;
		this.mes=1;
		this.anyo=2023;
	}
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public int setDia(int dia) {
		return this.dia=dia;
	}
	public int setMes(int mes) {
		return this.mes=mes;
	}
	public int setAnyo(int anyo) {
		return this.anyo=anyo;
	}
	public Fecha(int dia, int mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	public Fecha(GregorianCalendar gc) {
		this.dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
		this.mes=gc.get(GregorianCalendar.MONTH)+1;
		this.anyo=gc.get(GregorianCalendar.YEAR);
	}
	/*public Fecha(String f) {
		int contador=0; int primeraBarra=-1; int segundaBarra=-1;
		for(int i=0; i<f.length(); i++) {
			if (f.charAt(i)=='/' && contador==0) {
				primeraBarra=i; contador=1;
			}
			if (f.charAt(i)=='/' && contador==1) {
				segundaBarra=i; 
			}
		}	
		int dia=0;
		for(int i=0; i<primeraBarra; i++) {dia=dia*10 + (f.charAt(i) - '0');}
		int mes=0;
		for(int i=primeraBarra+1; i<segundaBarra; i++) {mes=mes*10 + (f.charAt(i) - '0');} 
		int anyo=0;
		for(int i=segundaBarra+1; i<f.length(); i++) {anyo=anyo*10 + (f.charAt(i) - '0');}
	
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}*/
	
	
	//constructor para crear instancias pasando como parametro un String con formato 12/5/2103
	public Fecha(String f) {
		int d= f.indexOf("/"); int m=f.lastIndexOf("/");
		String primeraBarra = f.substring(0, d);
		String ultimaBarra = f.substring(m+1);
		String medio = f.substring(d+1, m-1);
		this.dia = Integer.parseInt(primeraBarra);
		this.mes = Integer.parseInt(medio);
		this.anyo = Integer.parseInt(ultimaBarra);
	}	
	public void plusDias(int dias) {
		GregorianCalendar f = new GregorianCalendar(this.anyo, this.mes-1, this.dia);
		f.add(GregorianCalendar.DATE, 1);
		this.dia=f.get(GregorianCalendar.DAY_OF_MONTH);
		this.mes=f.get(GregorianCalendar.MONTH)+1;
		this.anyo=f.get(GregorianCalendar.YEAR);
	}
	
	public void next() {
	this.plusDias(1);
	}
	
	public GregorianCalendar toGregorian() {
		return new GregorianCalendar(this.dia, this.mes-1, this.anyo);
	}
	
	public void next2() {
		
	}
	
		public String toString() {
	
		return dia + "/" + mes + "/" + anyo;
	}
}
}
