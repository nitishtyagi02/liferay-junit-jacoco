package com.nitish.junit.sample.portlet.service.impl;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;


public class JunitServiceImplUT extends JunitServiceBaseUnitTest{


	
	@Spy
	@InjectMocks
	JunitServiceImpl sut;
	
	
	String FIRST="A";
	String SECOND="B";
	
	
	@Test
	public void testGetAddtwoString() {
		
		//Act
		sut.getAddtwoString(FIRST, SECOND);
		
		//Verify
		verify(sut,times(1)).addStr(FIRST, SECOND);
	}
}
