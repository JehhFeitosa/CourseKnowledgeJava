package com.testes;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AssertJTest {
	
	 @Test
	  public void testAssertArrayEquals() {
	    byte[] esperado = "tese".getBytes();
	    byte[] atual = "teste".getBytes();
	    assertArrayEquals(esperado, atual);
	  }

}
