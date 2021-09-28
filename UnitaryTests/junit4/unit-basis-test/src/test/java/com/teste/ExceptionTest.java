package com.teste;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {

		List<String> list = new ArrayList<String>();
		list.add("Gordão");
		list.get(0);
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();

		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0);

	}

	@Test
	public void testxceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperao que IndexOutOfBoundsException sea lançada");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
		}
	}

	private Matcher<? super String> is(String string) {
		return null;
	}

}
