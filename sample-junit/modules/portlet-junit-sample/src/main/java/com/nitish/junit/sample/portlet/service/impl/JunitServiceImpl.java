package com.nitish.junit.sample.portlet.service.impl;

import java.util.List;

import com.nitish.junit.sample.service.JunitService;

public class JunitServiceImpl implements JunitService{

	@Override
	public String getAddtwoString(String first, String Second) {
		String sum=addStr(first, Second);
		return sum;
	}
	
	String addStr(String a, String b) {
		return a+b;
	} 
	
}
