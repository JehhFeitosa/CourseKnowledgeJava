package com.testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
 


public class MockitoTest {

	public void test() {
		
		List mock = mock(List.class);
		
		when(mock.get(0)).thenReturn("one");
		when(mock.get(1)).thenReturn("one");
		
		//nomeCodeThatInteracteWithMock();
		
		verify(mock).clear();
		

	}

}
