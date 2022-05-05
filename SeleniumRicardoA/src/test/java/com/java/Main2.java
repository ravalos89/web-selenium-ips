package com.java;

import com.java.accessmodifiers.Hello;

public class Main2{

	public static void main(String[] args) {
		
//		Humano ricardo = new Humano();
//		ricardo.altura = 1.74;
//		ricardo.colorCabello = "Cafe oscuro";
//		ricardo.colorOjos = "Cafe oscuro";
//		ricardo.numManos = 2;
//		ricardo.numOjos = 2;
//		ricardo.numPiernas = 2;
		
		// Utilizando un constructor
		Humano ricardo = new Humano("Cafe oscuro", "Cafe oscuro", 1.74);
		
		System.out.println("Cuanto mide Ricardo? " + ricardo.altura);
		System.out.println("Cuantas piernas tiene Ricardo? " + ricardo.numPiernas);
		
		Humano pedrito = new Humano(2, 1, 2, "Negro", "Negro", 1.8);
		
		
		

	}

}
