package com.testes;

import java.util.List;

import org.junit.Test;

import static org.easymock.EasyMock.*;

public class EasyMockTest {
	
public void test() {
		
		List mock = createNiceMock(List.class);
		
		expect(mock.get(0)).andStubReturn("one");
		expect(mock.get(1)).andStubReturn("one");
		mock.clear();
		
		replay(mock);
		
		//nomeCodeThatInteracteWithMock();
		
		verify(mock);

	}

}
