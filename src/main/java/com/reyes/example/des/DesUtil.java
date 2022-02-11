package com.reyes.example.des;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 簡易，https://www.cxyzjd.com/article/u010989191/51298287
 * DES算法，自行搜尋
 *
 *	api
 *	https://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html
 */
public class DesUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(DesUtil.class);
	
	public void desEnc(String orgData) throws Exception {
//		使用des機加密，key長度要為8byte
		String key = "12345678";
		
//		算法
		String transformation = "DES";
		
//		創建加密對象
		Cipher c = Cipher.getInstance(transformation);
		
		String algorithm = "DES";
		
//		加密規則
		SecretKeySpec securetKey = new SecretKeySpec(key.getBytes(), algorithm);
		
//		初始化
		c.init(Cipher.ENCRYPT_MODE, securetKey);
		
//		調用加密(或解密)
		byte[] encryptData = c.doFinal(orgData.getBytes());
		
//		用Base64處理byte資料顯示(直接使用ascii顯示，會出現亂碼
		logger.info("[+] 加密後資料: " + new String(encryptData));
		
//		https://www.baeldung.com/java-base64-encode-and-decode
		logger.info("[+] 加密後資料: {} ",  Base64.getEncoder().withoutPadding().encodeToString(encryptData));
	}
	
}
