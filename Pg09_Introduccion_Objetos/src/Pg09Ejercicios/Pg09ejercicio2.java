package Pg09Ejercicios;

public class Pg09ejercicio2 {

	public static void main(String[] args) {
		//Fecha fecha3 = new Fecha(1,1,2021);
		Fecha fecha1 = new Fecha();
		Fecha fecha2 = new Fecha();
		fecha2.setDia(1);
		fecha2.setMes(2);
		fecha2.setAnyo(2023);
		boolean resultado;
		resultado = fecha1.equals(fecha2); 
		System.out.println(resultado);
		resultado = fecha1.isposterior(fecha2); 
		System.out.println(resultado);
	}
	
	public static class Fecha {
		private int dia;
		private int mes;
		private int anyo;
	
	
	public Fecha() {
		this.dia=2;
		this.mes=5;
		this.anyo=2023;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public Fecha(int dia, int mes, int anyo ) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	
	public boolean equals(Fecha fecha) {
		if (dia != fecha.getDia())  return false;
		if (mes != fecha.getMes())  return false;
		if (anyo !=fecha.getAnyo()) return false;
		return true;
	}
	
	public boolean isposterior(Fecha f) {
		//boolean posterior = true;
		if (anyo<f.getAnyo()) return false;
		else if (anyo==f.getAnyo()) { 
			if (mes<f.getMes()) return false;
			else if (mes==f.getMes()) {if (dia<f.getDia()) return false;} } 
		return true;
	}
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, anyo);
	}
	}
}
	

