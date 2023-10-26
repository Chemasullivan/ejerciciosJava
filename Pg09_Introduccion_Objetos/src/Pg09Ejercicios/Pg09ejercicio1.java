package Pg09Ejercicios;


public class Pg09ejercicio1 {

	public static void main(String[] args) {

	Fecha fecha1 = new Fecha();  Fecha fecha = new Fecha(); Fecha fechaP = new Fecha(3,10,1981);
		fecha1.setDia(7);
		fecha1.setMes(9);
		fecha1.setAnyo(2023);
		
		System.out.println(fecha1.toString());
		
		System.out.println(fecha1.getDia());
		System.out.println(fecha.getDia());
		fecha.setDia(10); System.out.println(fecha.getDia());
		System.out.println(fechaP);
	}
	

	public static class Fecha { //aqui metemos los atributos
		private int dia;
		private int mes;
		private int anyo;
	
	//constructor por defecto
	public Fecha() { //aqui se crea un constructor con unos valores iniciales por defecto
		this.dia = 1;
		this.mes = 1;
		this.anyo = 2023;
	}
	//constructor parametrizado
	public Fecha(int dia, int mes, int anyo) { //aqui creamos un constructor que coge parametros
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	//getter dia
	public int getDia()
	{
		return dia;
	}
	//setter dia
	public void setDia(int dia) {
		this.dia=dia;
	}
	//getter mes
		public int getMes()
		{
			return mes;
		}
		//setter mes
		public void setMes(int mes) {
			this.mes=mes;
		}
		//getter anyo
		public int getAnyo()
		{
			return anyo;
		}
		//setter dia
		public void setAnyo(int anyo) {
			this.anyo=anyo;
		}
		public String toString() {
			return String.format("%02d/%02d/%04d", dia, mes, anyo);
		}
}
}
