package Pg11Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Pg11Ejercicios.Pg11ejercicio4.FechasPersona;
import Pg11Ejercicios.Pg11ejercicio5.Fecha;
import Pg11Ejercicios.Pg11ejercicio5.Persona;

public class Pg11ejercicio6 {

	public static void main(String[] args) {
		//se crea un alista de personas. Se crean personas, se crean las 3 fechas de la persona y despues se añade a la lista la persona
		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		String nombre = "chema";
		Fecha[] fechas = new Fecha[3];
		fechas[Persona.FNacimiento]=new Fecha(3,10,1981);
		fechas[Persona.FBoda]=new Fecha(24,6,2011);
		fechas[Persona.FTrabajo]=new Fecha(1,9,2001);
		Persona persona1 = new Persona(nombre, fechas);
		listaPersonas.add(persona1);
		System.out.println(listaPersonas.get(0));
		
		nombre="Andres";
		fechas[Persona.FNacimiento] = new Fecha(5,7,1982);
		fechas[Persona.FBoda]=new Fecha(247,2,2013);
		fechas[Persona.FTrabajo]=new Fecha(3,10,2005);
		Persona persona2 = new Persona(nombre, fechas);
		listaPersonas.add(persona2);
		System.out.println(listaPersonas.get(1));
		
		Fecha[] fechasPepe= {new Fecha(3,8,1980), new Fecha(10,8,2008), new Fecha(6,12,2000)};
		listaPersonas.add(new Persona("Pepe", fechasPepe));
		
		Fecha[] fechasJuani= {new Fecha(1,2,1985), new Fecha(5,9,2009), new Fecha(1,2,2003)};
		listaPersonas.add(new Persona("juani", fechasJuani));
		
		
		System.out.println(listaPersonas.get(0));
		System.out.println(listaPersonas.get(1));
		System.out.println(listaPersonas.get(2));
		System.out.println(listaPersonas.get(3));
	
	}

}
