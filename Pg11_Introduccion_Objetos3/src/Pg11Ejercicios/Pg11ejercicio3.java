package Pg11Ejercicios;

import java.util.GregorianCalendar;

public class Pg11ejercicio3 {

	public static void main(String[] args) {
		FechasPersona [] fechas = new FechasPersona[10];
		Fecha fn = new Fecha(1,10,1981); Fecha fb = new Fecha(24,6,2011); Fecha ft = new Fecha("1/9/2001");
		FechasPersona p1 = new FechasPersona(fn, fb, ft); 
		FechasPersona p2 = new FechasPersona(new Fecha(), new Fecha("2/2/2020"), new Fecha(5,6,1990));
		FechasPersona p3 = new FechasPersona(new Fecha(1,6,1990), new Fecha("5/7/1995"), new Fecha(1,6,1999));
		fechas[0]= p1;
		fechas[1]= p2;
		fechas[2]= p3;
		System.out.println(fechas[0]);
		System.out.println(fechas[1]);
		System.out.println(fechas[2]);
	}
	
	public static class FechasPersona {
		
		   private Fecha fechaNacimiento;
		   private Fecha fechaBoda;
		   private Fecha fechaTrabajo;
		   		   	
		   public FechasPersona(Fecha fn, Fecha fb, Fecha ft) {
		   	fechaNacimiento = fn;
		   	fechaBoda = fb;
		   	fechaTrabajo = ft;
		   }
		    public Fecha getFechaNacimiento() {return fechaNacimiento;}
			public void setFechaNacimiento(Fecha fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
			public Fecha getFechaBoda() {return fechaBoda;}
			public void setFechaBoda(Fecha fechaBoda) {this.fechaBoda = fechaBoda;}
			public Fecha getFechaTrabajo() {return fechaTrabajo;}
			public void setFechaTrabajo(Fecha fechaTrabajo) {this.fechaTrabajo = fechaTrabajo;}
			
			public String toString() {
				return "fecha nacimiento: " + fechaNacimiento + " fecha boda: " + fechaBoda + " fecha trabajo: " + fechaTrabajo;
			}
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
		
		public Fecha()	{
			this.dia = 1;
			this.mes= 1;
			this.anyo= 2100;
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
		public Fecha(int dia, int mes, int anyo) {
			this.dia=dia;
			this.mes=mes;
			this.anyo=anyo;
		}
		public Fecha(String f) {
			int d= f.indexOf("/"); int m=f.lastIndexOf("/");
			String primeraBarra = f.substring(0, d);
			String ultimaBarra = f.substring(m+1);
			String medio = f.substring(d+1, m);
			this.dia = Integer.parseInt(primeraBarra);
			this.mes = Integer.parseInt(medio);
			this.anyo = Integer.parseInt(ultimaBarra);
		}	
		public boolean bisiesto(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true; 
			return false;
		}
		
		public int diasHastav2(Fecha f) {
			Fecha f1=this; Fecha f2= f;
			if (this.isPosterior(f)) {f2=this; f1=f;}
			int diasFuera = diasDiferencia(this.dia, this.mes, this.anyo, f.dia, f.mes, f.anyo); System.out.println("dias Fuera " + diasFuera);
			int diasAnyos = sumaDiasAnyo(f.anyo, this.anyo); System.out.println("Dias dentro " + diasAnyos);
			return Math.abs(diasAnyos - diasFuera); 
			
		}
		
		public int diasDiferencia(int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2) { //calcula los dias antes y despues de las fechas
			int diasTotales = 0; int totalInicio = 0, totalFinal = 0;
			int [] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
			if (bisiesto(anyo1)) diasMes[1]=29;  
			mes1--; mes2--; 
			for (int i=0; i<mes1; i++) { 
				totalInicio=totalInicio + diasMes[i];
			}
			totalInicio=totalInicio+dia1; diasMes[1]=28; 
			if (bisiesto(anyo2)) diasMes[1]=29;
			for (int i=11; i>mes2; i--) {  
				totalFinal=totalFinal + diasMes[i];}
			totalFinal=totalFinal+diasMes[mes2]-dia2; diasMes[1]=28;
			diasTotales = totalFinal+totalFinal;
			
			return diasTotales;
		}
		public int sumaDiasAnyo(int anyo1, int anyo2) { //calcula los dias completos que tienen todos los años  
			int anyos=(anyo1 - anyo2+1); int dias=365; int totalDias = 0;
			for (int i=0; i<anyos; i++) {System.out.println(anyo2);{if (bisiesto(anyo2)) {totalDias=totalDias+dias+1;}
				else totalDias=totalDias+dias; 
			anyo2++; }
			}
			return totalDias;
		}
		public boolean isPosterior(Fecha f) {
			//boolean posterior = true;
			if (anyo<f.getAnyo()) return false;
			else if (anyo==f.getAnyo()) { 
				if (mes<f.getMes()) return false;
				else if (mes==f.getMes()) {if (dia<f.getDia()) return false;} } 
			return true;
	}
		public void plusDias(int dias) {
			GregorianCalendar fecha = new GregorianCalendar(this.anyo, this.mes-1, this.dia);
			fecha.add(GregorianCalendar.DATE, dias);
			this.dia = fecha.get(GregorianCalendar.DAY_OF_MONTH);
			this.mes = fecha.get(GregorianCalendar.MONTH)+1;
			this.anyo = fecha.get(GregorianCalendar.YEAR);
		}
		public GregorianCalendar toGregorian() {
			return new GregorianCalendar(this.anyo, this.mes-1, this.dia);

		}
		public Fecha(GregorianCalendar gc) {
			this.dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
			this.mes = gc.get(GregorianCalendar.MONTH)+1;
			this.anyo = gc.get(GregorianCalendar.YEAR);
		}
		public String toString() {
			return dia + "/" + mes + "/" + anyo;
			
		}
	}
}
