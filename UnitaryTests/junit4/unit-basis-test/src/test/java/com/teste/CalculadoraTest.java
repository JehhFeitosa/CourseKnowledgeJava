package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int soma = calc.sonar("1+1+3");
		assertEquals(5, soma);
	}

}
