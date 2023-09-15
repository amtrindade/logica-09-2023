package com.logica;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {	
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();		
	}
	
	@Test
	public void testSomaValoresPositivosImpares() {		
		//faz o cáculo
		Integer somatorio = calculadora.soma(15, 25);
		//Valida o resultado
		assertEquals(40, somatorio, 0.000001);		
	}
	
	@Test
	public void testSomaValoresPositivosPares() {		
		Integer somatorio = calculadora.soma(10, 8);
		assertEquals(18, somatorio, 0.000001);
	}
	
	@Test
	public void testSomaValoresNegativos() {
		Integer somatorio = calculadora.soma(-8, -20);
		assertEquals(-28, somatorio, 0.000001);		
	}
	
	@Test
	public void testSomaUmValorZerado() {		
		Integer somatorio = calculadora.soma(0, 8);
		assertEquals(8, somatorio, 0.000001);
	}
	
	@Test
	public void testSubtracaoValoresPositivos() {		
		Integer subtracao = calculadora.subtracao(101, 98);
		assertEquals(3, subtracao, 0.00001);
	}
	
	@Test
	public void testMultiplicacaoValoresPositivos() {		
		Integer resultado = calculadora.multiplicacao(6, 7);
		assertEquals(42, resultado, 0.00001);
	}
	
	@Test
	public void testMaiorValorVemPrimeiro() {		
		Integer maior = calculadora.maiorValor(10, 4);
		assertEquals(10, maior, 0.00001);
	}
	
	@Test
	public void testMaiorValorVemSegundo() {		
		Integer maior = calculadora.maiorValor(5, 20);
		assertEquals(20, maior, 0.00001);
	}
	
	@Test
	public void testValoresIguais() {		
		Integer maior = calculadora.maiorValor(17, 17);
		assertEquals(17, maior, 0.00001);		
	}
	
	@Test
	public void testDivisaoValoresPositivos() {
		Integer divisao = calculadora.divisao(10, 2);
		assertEquals(5, divisao, 0.00001);
	}
	
	@Test
	public void testDivisaoPorZero() {		
		Integer divisao = calculadora.divisao(10, 0);
		assertEquals(0, divisao, 0.00001);
	}
	
	@Test
	public void testFatorialCinco() {
		Integer fatorial = calculadora.fatorial(5);
		assertEquals(120, fatorial, 0.00001);		
	}
	
	@Test
	public void testFatorialQuatro() {
		Integer fatorial = calculadora.fatorial(4);
		assertEquals(24, fatorial, 0.00001);		
	}
	
	@Test
	public void testFatorialZero() {
		Integer fatorial = calculadora.fatorial(0);
		assertEquals(1, fatorial, 0.00001);
	}
	
	@Test
	public void testFatorialUm() {
		Integer fatorial = calculadora.fatorial(1);
		assertEquals(1, fatorial, 0.00001);
	}
	
	@Test
	public void testFatorialMenos() {
		Integer fatorial = calculadora.fatorial(-1);
		assertEquals(0, fatorial, 0.00001);
	}
}
