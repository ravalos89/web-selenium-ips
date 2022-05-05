package com.java;

public class Metodo {

	public static void main(String[] args) {
		/*
		 * 1- Siempre pertenece a una clase, no se puede escribir fuera de una clase
		 * 2- Un metodo no se puede escribir dentro de otro metodo
		 * 3- Un metodo puee regresar cualquier tipo de dato u objeto, si el metodo no regresa nada es void.
		 * 4- Un metodo se puede sobreescribir N veces.
		 * 
		 * 		* Utilizar el mismo metodo cambiando el numero de parametros o tipo de parametros.
		 */

	}
	
	public static void sayHello(String lang) {
		
		
		
		System.out.println("Hello");
		
	}
	
	// Overloaded
	public static void sayHello(String hello, String algo) {
		
		saygoodbye();
		
	}
	
	public static void sayHello(int hello) {
		
		saygoodbye();
		
	}
	
	public static void saygoodbye() {
		
	}

}


