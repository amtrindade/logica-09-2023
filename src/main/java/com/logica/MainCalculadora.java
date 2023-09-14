package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Integer somatorio;	
		Calculadora calc = new Calculadora();
		
		somatorio = calc.soma(5, 9);
		System.out.println(somatorio);				
		
		somatorio = calc.soma(10, somatorio);
		System.out.println(somatorio);
	}

}
