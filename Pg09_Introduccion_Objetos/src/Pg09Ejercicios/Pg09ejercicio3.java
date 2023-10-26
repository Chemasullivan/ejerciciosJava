package Pg09Ejercicios;


public class Pg09ejercicio3 {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha();
		Fecha fecha3 = new Fecha(1,1,2023);
		System.out.println(fecha1.compareTo(fecha3));
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
		if (this.dia != fecha.getDia())  return false;
		if (this.mes != fecha.getMes())  return false;
		if (this.anyo !=fecha.getAnyo()) return false;
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
	
	public int compareTo(Fecha f) {
		if (this.equals(f)==true) return 0;
		if (this.isposterior(f)==true) return 1;
		return -1;
	}
	
	}
	
}
