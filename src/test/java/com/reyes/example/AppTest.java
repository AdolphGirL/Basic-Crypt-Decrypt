package com.reyes.example;

import org.junit.Test;

import com.reyes.example.des.DesUtil;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void demo() throws Exception {
		DesUtil DesUtil = new DesUtil();
		
//		原文
		String orgData = "今天天氣很好";
		DesUtil.desEnc(orgData);
		
		
	}
	
}
