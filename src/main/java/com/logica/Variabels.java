package com.logica;

import java.util.ArrayList;
import java.util.List;

public class Variabels {
	
	public static void main(String[] args) {
		
		//Variáveis do tipo String
		
		String nome1 = "Curso de";
		String nome2 = "Programação";
				
		imprimeConsole(nome1 +" "+nome2);
		
		//Variáveis do tipo Integer
		
		Integer numero1 = 23;
		Integer numero2 = 22;
		
		// Condicionais
		if (numero1 > numero2) {
			imprimeConsole("O número 1 é maior que o número 2");
			imprimeConsole(numero1.toString());
		}
		else if (numero2 > numero1) {
			imprimeConsole("O número 2 é maior que o número 1");
			imprimeConsole(numero2.toString());
		}
		else {
			imprimeConsole("Os valores são iguais!");
		}
		
		// Variáveis do tipo double
		Double valor1 = 99.82;
		Double valor2 = 112.33;
		
		Double total = valor1 + valor2;
		
		imprimeConsole("A soma dos valores é: "+total);
		
		//Boolean
		
		Boolean valor1MaiorQueValor2 = false;
		
		if (valor1MaiorQueValor2) {
			imprimeConsole("A variável booleana é: "+ valor1MaiorQueValor2);
		}
		else {
			imprimeConsole("O valor é falso");
		}
		
		// looping com for: valor inicial e final		
		for (int i = 1; i <= 10; i++) {
			imprimeConsole("Looping com for: " + i);			
		}
		
		// looping com while
		int i = 1;
		while ( i <= 10) {
			imprimeConsole("Looping com while: "+ i);
			i++;			
		}
		
		// looping em lista
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("TV LG");
		produtos.add("Smartphone Galaxy Samsung");
		produtos.add("Mouse sem fio");
		produtos.add("WebCan");
		produtos.add("TV Samsung");
		produtos.add("iPHone");
		produtos.add("Mouse com fio");
		produtos.add("WebCan Logic");
		
		imprimeConsole("O tamanho da lista é: "+ produtos.size());
		
		for (String produto : produtos) {
			imprimeConsole("O produto é: "+ produto);
		}
		
		imprimeConsole(produtos.get(2));
		
		List<Integer> valores = new ArrayList<Integer>();
		
		valores.add(1300);
		valores.add(500);
		valores.add(2300);
		
		Integer soma = 0;
		
		for (Integer valor : valores) {
			soma = somaValores(soma, valor);
		}
		
		imprimeConsole("A soma da lista é: "+ soma);
		
	}
	
	// função sem retorno
	private static void imprimeConsole(String valor) {
		System.out.println(valor);
	}
	
	// função com retorno
	private static Integer somaValores(Integer valor1, Integer valor2) {
		Integer resultado = valor1 + valor2;
		return resultado;		
	}
}
