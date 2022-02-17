package com.reyes.example.digest;

import java.security.MessageDigest;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用 java 原生 MessageDigest
 *	MD5
 *	SHA-1
 *	SHA-256
 *	SHA-384
 *	SHA-512
 */
public class DigestUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(DigestUtil.class);
	
	/**
	 * 
	 * @param input		原文
	 * @param algorithm	算法
	 * @return			base64 encode 資料
	 * @throws Exception
	 */
	public String messageDigestReturnBase64(String input, String algorithm) throws Exception {
		MessageDigest degist = MessageDigest.getInstance(algorithm);
		
//		進行轉換
		byte[] res = degist.digest(input.getBytes());
		
		logger.info("[+] 轉換後資料: {} ",  Base64.getEncoder().withoutPadding().encodeToString(res));
		
		return Base64.getEncoder().withoutPadding().encodeToString(res);
	}

	/**
	 * 
	 * @param input		原文
	 * @param algorithm	算法
	 * @return			16進制表達
	 * @throws Exception
	 */
	public String messageDigestReturnHEX(String input, String algorithm) throws Exception {
		MessageDigest degist = MessageDigest.getInstance(algorithm);
		
//		進行轉換
		byte[] res = degist.digest(input.getBytes());
		
//		16進制轉換
		StringBuilder sb = new StringBuilder();
		
		String hex = null;
		for (byte b : res) {
			hex = Integer.toHexString(b & 0xff);
			
//			高位補0
			if (hex.length() == 1) {
				hex = "0" + hex;
			}
			
			sb.append(hex);
			
			hex = null;
		}
		
		return sb.toString();
	}
	
}
