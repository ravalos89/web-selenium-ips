package com.java.herencia;

public class Hijo extends Padre {

	public Hijo(double altura, String tipoSangre, String colorOjos) {
		super(altura, tipoSangre, colorOjos);
	}
	
	public void hobbies() {
		System.out.println("Gaming");
	}

}
