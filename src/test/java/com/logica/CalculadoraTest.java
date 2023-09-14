package com.logica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {	
	
	@Test
	public void testSomaValoresPositivosImpares() {
		//cria o objeto
		Calculadora calculadora = new Calculadora();
		//faz o cáculo
		Integer somatorio = calculadora.soma(15, 25);
		//Valida o resultado
		assertEquals(40, somatorio, 0.000001);		
	}
	
	@Test
	public void testSomaValoresPositivosPares() {
		Calculadora calculadora = new Calculadora();
		Integer somatorio = calculadora.soma(10, 8);
		assertEquals(18, somatorio, 0.000001);
	}
	
	@Test
	public void testSomaValoresNegativos() {
		Calculadora calculadora = new Calculadora();
		Integer somatorio = calculadora.soma(-8, -20);
		assertEquals(-28, somatorio, 0.000001);		
	}
	
	@Test
	public void testSomaUmValorZerado() {
		Calculadora calculadora = new Calculadora();
		Integer somatorio = calculadora.soma(0, 8);
		assertEquals(8, somatorio, 0.000001);
	}
	
	@Test
	public void testSubtracaoValoresPositivos() {
		Calculadora calculadora = new Calculadora();
		Integer subtracao = calculadora.subtracao(101, 98);
		assertEquals(3, subtracao, 0.00001);
	}
	
	@Test
	public void testMultiplicacaoValoresPositivos() {
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.multiplicacao(6, 7);
		assertEquals(42, resultado, 0.00001);
	}
	
	@Test
	public void testMaiorValorVemPrimeiro() {
		Calculadora calculadora = new Calculadora();
		Integer maior = calculadora.maiorValor(10, 4);
		assertEquals(10, maior, 0.00001);
	}
	
	@Test
	public void testMaiorValorVemSegundo() {
		Calculadora calculadora = new Calculadora();
		Integer maior = calculadora.maiorValor(5, 20);
		assertEquals(20, maior, 0.00001);
	}
	
	@Test
	public void testValoresIguais() {
		Calculadora calculadora = new Calculadora();
		Integer maior = calculadora.maiorValor(17, 17);
		assertEquals(17, maior, 0.00001);		
	}
	
	@Test
	public void testDivisaoValoresPositivos() {
		Calculadora calculadora = new Calculadora();
		Integer divisao = calculadora.divisao(10, 2);
		assertEquals(5, divisao, 0.00001);
	}
	
	@Test
	public void testDivisaoPorZero() {
		Calculadora calculadora = new Calculadora();
		Integer divisao = calculadora.divisao(10, 0);
		assertEquals(0, divisao, 0.00001);
	}
}
