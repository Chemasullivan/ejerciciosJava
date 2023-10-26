package Pg10ejercicios;

public class Pg10ejercicio5 {

	public static void main(String[] args) {
		//Fecha f1 = new Fecha(3,10,1981);
		
		
	

	}
	
	
	public static class Persona {
		private String nombre;
		private Fecha fechaNacimiento;
		
	public Persona() {
		this.nombre="Chema";
		this.fechaNacimiento=new Fecha();
	}
	
	public String getNombre() {return this.nombre;}
	public Fecha getfechaNacimiento() {return this.fechaNacimiento;}
	public void setNombre (String nombre) { this.nombre=nombre;}
	public void setFechaNacimiento(Fecha fechaNacimiento) {this.fechaNacimiento=fechaNacimiento;}
	
	public Persona (String nombre, Fecha f) {
		this.nombre=nombre;
		this.fechaNacimiento=f;
	}
	
	
	public String toString() {
		return "nombre: " + nombre + "\nfecha de nacimiento: " + fechaNacimiento; 
	}
	
	}
	
		public static class Fecha {
		private int dia;
		private int mes;
		private int anyo;

		public Fecha() {
			int dia = 1;
			int mes = 2;
			int anyo = 2023;
		}
		//getter y setter
		public int getDia() {return dia;}
		public int getMes() {return dia;}
		public int anyo()   {return anyo;}
		public void setDia(int dia)   {this.dia=dia;}
		public void setMes(int mes)   {this.mes=mes;}
		public void setAnyo(int anyo) {this.anyo=anyo;}
		//constructor fecha con parametros
		public Fecha (int dia, int mes, int anyo) {
			this.dia=dia;
			this.mes=mes;
			this.anyo=anyo;
		}
		public Fecha(String f) {
			int d= f.indexOf("/"); int m=f.lastIndexOf("/");
			String primeraBarra = f.substring(0, d);
			String ultimaBarra = f.substring(m+1);
			String medio = f.substring(d+1, m-1);
			this.dia = Integer.parseInt(primeraBarra);
			this.mes = Integer.parseInt(medio);
			this.anyo = Integer.parseInt(ultimaBarra);
		}	
		public String toString() {
			return dia + "/" + mes + "/" + anyo;
 		}
		
		
		
}
}