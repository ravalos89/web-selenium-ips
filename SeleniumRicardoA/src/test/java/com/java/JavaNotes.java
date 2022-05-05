package com.java;

public class JavaNotes {
	
	// Java ecosystem
//	
//	- JVM (Java virtual machine)
//	- JRE (Java Run Environment)
//	- JDK (Java Dev Kit)
	
//	Primitive data types
	
	/*
	 * 1- Byte
	 * 2- Short
	 * 3- Int - ---->
	 * 4- Long ---->
	 * 5- float
	 * 6- double ---->
	 * 7- Char ----> String
	 * 8- boolean ---->
	 */
	
	public static void main(String[] args) {
		
		// Fases de una variable
		
		// Declaracion
		
		int x;
		double y;
		
		// Inicializacion
		
		x = 10;
		y = 2.5;
		
		int a = 12;
		
		// utilizacion
		
		double z = x + y;
		
		// Operadores
		
		// Aritmeticos (+, -, /, *)
		
		int suma = a + x;
		
		// Unarios (++, --)
		
		++suma;
		
		// Relacionales (==, !=, >, >=)
		
		if(a!=x) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// Condicionales (AND = && ; OR == ||)
		
		if(a!=x && suma==z) {
			// Block code
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// Bit (& ~ )
		
		// ESTRUCTURAS
		
		// CONDICIONALES
		
//		if, if else, if anidado, switch
		
		if(a!=x) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		int numero = 15;
		
		switch(numero) {
		
		case 1:
		case 2:
			// Block code
			System.out.println("el valor es 1");
			
			break;
			
		case 15:
			System.out.println("El valor es 15");
			break;
			
			default:
				System.out.println("");
				break;
		}
		
		// Loops
		
//		while, do while, for
		
		while(numero <=20) {
			System.out.println("Algo");
			numero++;

		}
		
		do {
			
			System.out.println("Do while");
			numero++;
			
		}while(numero<30);
		
		// for
		for(int i=0; i<numero; i++) {
			
		}

	}
	
	

}
