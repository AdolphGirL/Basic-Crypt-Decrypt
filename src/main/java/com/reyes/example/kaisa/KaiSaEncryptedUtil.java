package com.reyes.example.kaisa;

/**
 * 凱薩加密 - 移位法工具類
 */
public class KaiSaEncryptedUtil {
	
	
	/**
	 * 加密
	 * @param org	原文
	 * @param key	偏移量
	 * @return
	 */
	public static String encrypte(String org, int key){
		StringBuilder crypt = new StringBuilder();
		
		for (char item : org.toCharArray()) {
			int b = item;
			b = b + key;
			char newItem = (char)b;
			
			crypt.append(newItem);
		}
		
		return crypt.toString();
	}
	
	/**
	 * 解密
	 * @param org	密文
	 * @param key	偏移量
	 * @return
	 */
	public static String decrypted(String org, int key){
		StringBuilder decrypt = new StringBuilder();
		
		for (char item : org.toCharArray()) {
			int b = item;
			b = b - key;
			char newItem = (char)b;
			
			decrypt.append(newItem);
		}
		
		return decrypt.toString();
	}
	
	
	
}
