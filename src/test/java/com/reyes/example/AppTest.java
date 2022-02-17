package com.reyes.example;

import org.junit.Test;

import com.reyes.example.des.DesUtil;
import com.reyes.example.digest.DigestUtil;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
//	@Test
//	public void demo() throws Exception {
//		DesUtil DesUtil = new DesUtil();
//		
////		原文
//		String orgData = "今天天氣很好";
//		DesUtil.desEnc(orgData);
//	}
	
	@Test
	public void demoMD5() throws Exception {
		DigestUtil DigestUtil = new DigestUtil();
		
		String orgData = "今天天氣很好";
		String algorithm = "MD5";
		
		String baseRes = DigestUtil.messageDigestReturnBase64(orgData, algorithm);
		String hexRes = DigestUtil.messageDigestReturnHEX(orgData, algorithm);
		
		System.out.println("[+] baseRes: " + baseRes);
		System.out.println("[+] hexRes: " + hexRes);
	}
	
}
