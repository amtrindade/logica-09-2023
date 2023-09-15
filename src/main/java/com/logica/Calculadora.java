package com.logica;

public class Calculadora {
	
	public Integer soma(Integer num1, Integer num2) {
		Integer total = num1 + num2;
		return total;		
	}
	
	public Integer subtracao(Integer num1, Integer num2) {
		Integer total = num1 - num2;
		return total;		
	}
	
	public Integer multiplicacao(Integer num1, Integer num2) {
		Integer resultado = num1 * num2;
		return resultado;
	}
	
	public Integer divisao(Integer num1, Integer num2) {
		Integer resultado;
		if (num2 == 0) {
			resultado = 0;
		}
		else {
			resultado = num1 / num2;
		}
		return resultado;
	}
	
	public Integer maiorValor(Integer num1, Integer num2) {
		Integer maior;
		
		if (num1 > num2) {
			maior = num1;
		}
		else if(num2 > num1) {
			maior = num2;
		}
		else {
			maior = num1;
		}
		return maior;		
	}
	
	public Integer fatorial(Integer valor) {
		Integer fatorial = 1;
		
		if (valor < 0) {
			fatorial = 0;
		}
		else {
			for (int i = 1; i <= valor; i++) {
				fatorial = fatorial * i;
			}			
		}
		return fatorial;				
	}
}
