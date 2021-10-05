package com.testes;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.teste.Person;

public class AssertJTest {
	
	@Test
	public void checkEquality() {
		Person person= new Person("Barrack", "Obama");
		Person personClone = person;

		assertThat(person).isEqualTo(personClone);
	}

}
