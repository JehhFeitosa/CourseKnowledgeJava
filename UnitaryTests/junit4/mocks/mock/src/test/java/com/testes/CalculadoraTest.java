package com.testes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		
		Calculadora calculadora = new Calculadora();
		int sum = calculadora.somar("1+2+3");
		assertEquals(6, sum);
	}
	
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);
		
		int res = calculadora.somar("1+2");
		
		assertEquals(10, res);
		
	}

}
