package com.reyes.example.demo;

/**
 * 凱薩加密 - 移位法
 *
 */
public class CaesarDemo {
	
	public static void main(String[] args) {
		int offset = 3;
		
		String input = "hello world";
		System.out.println("[+] 原文: " + input);
		
		String cryptString = cryptCaesar(input, offset);
		System.out.println("[+] 加密: " + cryptString);
		
		String decryptString = decryptCaesar(cryptString, offset);
		System.out.println("[+] 解密: " + decryptString);
	}
	
	/**
	 * 加密
	 * @param org	原文
	 * @param key	位移量
	 * @return
	 */
	public static String cryptCaesar(String org, int key) {
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
	 * @param key	位移量
	 * @return
	 */
	public static String decryptCaesar(String org, int key) {
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
