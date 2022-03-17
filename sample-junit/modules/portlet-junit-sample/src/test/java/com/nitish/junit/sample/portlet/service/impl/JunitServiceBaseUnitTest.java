package com.nitish.junit.sample.portlet.service.impl;

import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JunitServiceBaseUnitTest {

	@Rule
	public final ExpectedException expectedException = ExpectedException.none();

	protected void expectException(final Class<?> type) {
		expectedException.expect(isA(type));
	}

	protected void expectException(final Class<?> type, final String message) {
		expectedException.expect(isA(type));
		expectedException.expectMessage(equalTo(message));

	}

}
