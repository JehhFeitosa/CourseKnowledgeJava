package com.testes;

import java.util.List;

public class EasyMockTest {
	
public void test() {
		
		List mock = createNiceMock(List.class);
		
		expect(mock.get(0)).andStubReturn("one");
		expect(mock.get(1)).andStubReturn("one");
		mock.clear();
		
		replay(mock);
		
		//nomeCodeThatInteracteWithMock();
		
		verify(mock).clear();
		

	}

}
