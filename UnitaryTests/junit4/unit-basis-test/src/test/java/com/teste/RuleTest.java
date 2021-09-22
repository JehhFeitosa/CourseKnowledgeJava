package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {
	
	//Pasta temporaria será criada antes da execução do teste
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder();
	
	@Test
	public void shouldCreateNewFileInTemporaryFolder() throws IOException {
		//Criará um arquivo dentro da pasta temporaria.
		File created = tmpFolder.newFile("file.txt");

		// Verifica se o arquivo foi criado
		assertTrue(created.isFile());
		//Verifica se o Root da pasta temporária é o mesmo do arquivo criado.
		assertEquals(tmpFolder.getRoot(), created.getParentFile());
		
	}
	
	

}
