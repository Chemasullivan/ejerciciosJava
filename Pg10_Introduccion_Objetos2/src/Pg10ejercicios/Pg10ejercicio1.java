package Pg10ejercicios;



public class Pg10ejercicio1 {

			public static void main(String[] args) {
				Fecha fecha1 = new Fecha("03/10/1981");
				System.out.println(fecha1);

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
			public String toString() {
				return dia + "/" + mes + "/" + anyo;
			}
	}
}



