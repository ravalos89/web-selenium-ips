package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		
		// Herencia
		Padre pedro = new Padre(1.76, "O+", "Negro");
		pedro.temperamento();
		
//		pedro.altura = 1000000;
		pedro.setAltura(1.80);
		
		System.out.println("Cuanto mide Pedro Abuelo? " + pedro.getAltura());
		
		Hijo pedroHijo = new Hijo(1.75, "O-", "Cafe");
//		System.out.println(pedroHijo.altura);
		pedroHijo.deporte();
		
		Nieto pedroNieto = new Nieto(1.15, "O-", "Verde");
		pedroNieto.deporte();
		pedroNieto.hobbies();
		
		

	}

}
