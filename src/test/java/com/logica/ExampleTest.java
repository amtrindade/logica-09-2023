package com.logica;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testNumberOne() {
		System.out.println("testNumberOne");
				
	}
	
	@Test
	public void testNumberTwo() {
		System.out.println("testNumberTwo");
		//fail("Não funciona");
	}
	
	@Test
	public void testNumberThree() {
		System.out.println("testNumberThree");
				
	}

}
