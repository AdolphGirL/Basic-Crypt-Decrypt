package com.reyes.example.demo;

/**
 * 凱薩加密 - 移位法
 *
 */
public class CaesarDemo {
	
	public static void main(String[] args) {
		String input = "hello world";
		String chInput = "測試中文字";
		
		StringBuilder crypt = new StringBuilder();
		StringBuilder chCrypt = new StringBuilder();
		
//		位移3
		int offset = 3;
		for (char item : input.toCharArray()) {
			int b = item;
			b = b + offset;
			char newItem = (char)b;
			
			crypt.append(newItem);
		}
		
		int chOffset = 3;
		for (char item : chInput.toCharArray()) {
			int b = item;
			b = b + chOffset;
			char newItem = (char)b;
			
			chCrypt.append(newItem);
		}
		
		System.out.println("[+] [CaesarDemo] crypt res: " + crypt.toString());
		System.out.println("[+] [CaesarDemo] ch crypt res: " + chCrypt.toString());
	}
	
}
