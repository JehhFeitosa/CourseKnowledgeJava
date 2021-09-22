package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {

	//Comparando os Bytes
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}

	//Comparando String
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}
	
	//Validando se o objeto é falso
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}
	
	//Para garantir que um objeto não é null
	@Test
	public void testAssertNotNull() {
		assertNotNull(new Object());
	}
	
	//Veriicando se os objetos não são os mesmos
	@Test
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object());
	}
	
	//Verificando se o obejto fica null em um determinado momento
	@Test
	public void testAssertNull() {
		assertNull(null);
	}
	
	//Verificanso se o os objetos não são os mesmos
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		assertSame(aNumber, aNumber);
	}

	
	
}
